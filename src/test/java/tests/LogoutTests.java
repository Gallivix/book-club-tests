package tests;

import models.login.LoginBodyModel;

import models.login.SuccessfulLoginResponseModel;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static java.lang.String.format;
import static org.hamcrest.Matchers.notNullValue;
import static specs.login.LoginSpec.loginRequestSpec;
import static specs.login.LoginSpec.sucessfullLoginResponseSpec;
public class LogoutTests<Responce> extends TestBase{


    String username = "GallivixQaGuru";
    String password = "1234";

    @Test
    public void sucessfullLogoutTest() {

        LoginBodyModel loginData = new LoginBodyModel(username, password);
        String refreshToken = given(loginRequestSpec)
                .body(loginData)
                .when()
                .post("/auth/token/")
                .then()
                .spec(sucessfullLoginResponseSpec)
                .extract().path("refresh");


        // Создать модель и убрать в спецификацию
        String logoutData = format("{\"refresh\": \"%s\"}", refreshToken);

                 given()
                .log().all()
                .contentType(JSON)
                .body(logoutData)
                .basePath("api/v1")
                .when()
                .post("/auth/logout/")
                .then()
                .log().all()
                .statusCode(200);

        //String logoutData = format("{\"refresh\": \"%s\"}", refreshToken);


       /* given()
                .log().all()
                .contentType(JSON)
                .body(logoutData)
                .formParam("refresh", refreshToken)
                .basePath("api/v1")
                .when()
                .post("/auth/logout/")
                .then()
                .log().all()
                .statusCode(200);       */

    }
}
