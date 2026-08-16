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
import static tests.TestData.*;


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


        assertThat(registrationResponse.remoteAddr()).matches(IP_REGEX);
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

        assertThat(secondRegistrationResponse.username().getFirst())
                .isEqualTo(USER_ALREADY_EXISTS_ERROR);
    }

}