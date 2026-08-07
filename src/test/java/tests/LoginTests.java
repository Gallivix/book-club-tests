package tests;

import models.login.LoginBodyModel;
import models.login.SuccessfulLoginResponseModel;
import models.login.WrongCredentialsLoginResponseModel;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static specs.login.LoginSpec.*;


public class LoginTests extends TestBase {

    String username = "GallivixQaGuru";
    String password = "1234";
    String wrongPassword = "GallivixQaGuru1234";


    @Test
    public void successfulLoginTest() {

        LoginBodyModel loginData = new LoginBodyModel(username, password);

        SuccessfulLoginResponseModel LoginResponse = given(loginRequestSpec)
                .body(loginData)
                .when()
                .post("/auth/token/")
                .then()
                .spec(sucessfullLoginResponseSpec)
                .extract().as(SuccessfulLoginResponseModel.class);

        String expectedTokenPath = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9";
        String actualAccess = LoginResponse.access();
        String actualRefresh = LoginResponse.refresh();

        assertThat(actualAccess).startsWith(expectedTokenPath);
        assertThat(actualRefresh).startsWith(expectedTokenPath);
        assertThat(actualAccess).isNotEqualTo(actualRefresh);
    }

    @Test
    public void wrongCredentialsLoginTest() {

        LoginBodyModel loginData = new LoginBodyModel(username, wrongPassword);

        WrongCredentialsLoginResponseModel LoginResponse = given(loginRequestSpec)
                .body(loginData)
                .when()
                .post("/auth/token/")
                .then()
                .spec(wrongCredentialsLoginResponseSpec)
                .extract().as(WrongCredentialsLoginResponseModel.class);

        String expectedDetailError = "Invalid username or password.";
        String actualDetailError = LoginResponse.detail();

        assertThat(actualDetailError).isEqualTo(expectedDetailError);
    }

/*    @Test
    public void successfulLoginTest() {

        LoginBodyModel loginData = new LoginBodyModel(username, password);

        SuccessfulLoginResponseModel LoginResponse = given()
                .log().all()
                .contentType(JSON)
                .body(loginData)
                .basePath("api/v1")
                .when()
                .post("/auth/token/")
                .then()
                .log().all()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("schemas/login/successful_login_response_schema.json"))
                .body("access", notNullValue())
                .body("refresh", notNullValue())
                .extract().as(SuccessfulLoginResponseModel.class);

        String expectedTokenPath = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9";
        String actualAccess = LoginResponse.access();
        String actualRefresh = LoginResponse.refresh();

        assertThat(actualAccess).startsWith(expectedTokenPath);
        assertThat(actualRefresh).startsWith(expectedTokenPath);
        assertThat(actualAccess).isNotEqualTo(actualRefresh);
    }

    @Test
    public void wrongCredentialsLoginTest() {

        LoginBodyModel loginData = new LoginBodyModel(username, wrongPassword);

        WrongCredentialsLoginResponseModel LoginResponse = given()
                .log().all()
                .contentType(JSON)
                .body(loginData)
                .basePath("api/v1")
                .when()
                .post("/auth/token/")
                .then()
                .log().all()
                .statusCode(401)
                .body(matchesJsonSchemaInClasspath(
                        "schemas/login/wrong_credentials_login_response_schema.json"))
                .body("detail", notNullValue())
                .extract().as(WrongCredentialsLoginResponseModel.class);

        String expectedDetailError = "Invalid username or password.";
        String actualDetailError = LoginResponse.detail();

        assertThat(actualDetailError).isEqualTo(expectedDetailError);
    }*/

}