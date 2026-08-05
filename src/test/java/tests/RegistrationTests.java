package tests;

import models.registration.ExistingUserResponceModel;
import models.registration.RegistrationBodyModel;
import models.registration.SucessfulRegistrationResponceModel;
import net.datafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.notNullValue;


public class RegistrationTests extends TestBase {

    String username;
    String password;

    @BeforeEach
    public void prepareTestData() {
        Faker faker = new Faker();
        username = faker.name().firstName() + "_" + System.currentTimeMillis();
        password = faker.regexify("[A-Za-z0-9!@#$%^&*]{8,16}");

    }


    @Test
    public void successfulRegistrationTest() {

        RegistrationBodyModel registrationData = new RegistrationBodyModel(username, password);

        SucessfulRegistrationResponceModel registrationResponse = given()
                .log().all()
                .contentType(JSON)
                .basePath("api/v1")
                .body(registrationData)
                .when()
                .post("/users/register/")
                .then()
                .log().all()
                .statusCode(201)
                .body(matchesJsonSchemaInClasspath(
                        "schemas/registration/successful_registration_response_schema.json"))
                .body("username", notNullValue())
                .body("id", notNullValue())
                .body("remoteAddr", notNullValue())
                .extract()
                .as(SucessfulRegistrationResponceModel.class);

        assertThat(registrationResponse.username()).isEqualTo(username);
        assertThat(registrationResponse.id()).isGreaterThan(0);
        assertThat(registrationResponse.firstName()).isEmpty();
        assertThat(registrationResponse.lastName()).isEmpty();
        assertThat(registrationResponse.email()).isEmpty();


        String ipAddrRegexp = "\"^((25[0-5]|2[0-4]\\\\d|1\\\\d\\\\d|[1-9]?\\\\d)\\\\.){3}\"\n" +
                "               + \"(25[0-5]|2[0-4]\\\\d|1\\\\d\\\\d|[1-9]?\\\\d)$\"";

        assertThat(registrationResponse.remoteAddr().matches(ipAddrRegexp));
    }

    @Test
    public void existingUserWrongRegistrationTest() {

        RegistrationBodyModel registrationData = new RegistrationBodyModel(username, password);
        SucessfulRegistrationResponceModel firstRegistrationResponse = given()
                .log().all()
                .contentType(JSON)
                .basePath("api/v1")
                .body(registrationData)
                .when()
                .post("/users/register/")
                .then()
                .log().all()
                .statusCode(201)
                .body(matchesJsonSchemaInClasspath(
                        "schemas/registration/successful_registration_response_schema.json"))
                .body("username", notNullValue())
                .body("id", notNullValue())
                .body("remoteAddr", notNullValue())
                .extract()
                .as(SucessfulRegistrationResponceModel.class);

        assertThat(firstRegistrationResponse.username()).isEqualTo(username);

        ExistingUserResponceModel  secondRegistrationResponse= given()
                .log().all()
                .contentType(JSON)
                .basePath("api/v1")
                .body(registrationData)
                .when()
                .post("/users/register/")
                .then()
                .log().all()
                .statusCode(400)
                .body(matchesJsonSchemaInClasspath(
                        "schemas/registration/existing_user_registration_response_schema.json"))
                .body("username", notNullValue())
                .extract()
                .as(ExistingUserResponceModel.class);

        String expectedError = "A user with that username already exists.";
        String actualError = secondRegistrationResponse.username().getFirst();
        assertThat(actualError).isEqualTo(expectedError);
    }

}