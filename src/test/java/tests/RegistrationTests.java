package tests;

import models.registration.ExistingUserResponceModel;
import models.registration.RegistrationBodyModel;
import models.registration.SucessfulRegistrationResponceModel;
import net.datafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static specs.registration.RegistrationSpec.*;


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

        SucessfulRegistrationResponceModel registrationResponse = given(registrationRequestSpec)
                .body(registrationData)
                .when()
                .post("/users/register/")
                .then()
                .spec(sucessfullRegistrationResponseSpec)
                .extract()
                .as(SucessfulRegistrationResponceModel.class);

        assertThat(registrationResponse.username()).isEqualTo(username);
        assertThat(registrationResponse.id()).isGreaterThan(0);
        assertThat(registrationResponse.firstName()).isEmpty();
        assertThat(registrationResponse.lastName()).isEmpty();
        assertThat(registrationResponse.email()).isEmpty();


        String ipAddrRegexp = "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";

        assertThat(registrationResponse.remoteAddr()).matches(ipAddrRegexp);
    }

    @Test
    public void existingUserWrongRegistrationTest() {

        RegistrationBodyModel registrationData = new RegistrationBodyModel(username, password);
        SucessfulRegistrationResponceModel firstRegistrationResponse = given(registrationRequestSpec)
                .body(registrationData)
                .when()
                .post("/users/register/")
                .then()
                .spec(sucessfullRegistrationResponseSpec)
                .extract()
                .as(SucessfulRegistrationResponceModel.class);

        assertThat(firstRegistrationResponse.username()).isEqualTo(username);

        ExistingUserResponceModel  secondRegistrationResponse= given(registrationRequestSpec)
                .body(registrationData)
                .when()
                .post("/users/register/")
                .then()
                .spec(existingUserRegistrationErrorSpec)
                .extract()
                .as(ExistingUserResponceModel.class);

        String expectedError = "A user with that username already exists.";
        String actualError = secondRegistrationResponse.username().getFirst();
        assertThat(actualError).isEqualTo(expectedError);
    }

}