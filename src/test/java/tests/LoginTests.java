package tests;

import models.login.LoginBodyModel;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoginTests extends TestBase {

    String username = "GallivixQaGuru";
    String password = "1234";


    @Test
    public void successfulLoginTest() {

        LoginBodyModel loginData = new LoginBodyModel(username, password);
        given()
                .log().all()
                .contentType(JSON)
                .body(loginData)
                .when()
                .post("api/v1/auth/token/")
                .then()
                .log().all()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("schemas/login_response_schema.json"))
                .body("access", notNullValue())
                .body("refresh", notNullValue());
    }

}