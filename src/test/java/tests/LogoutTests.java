package tests;

import models.login.LoginBodyModel;
import models.logout.LogoutModel;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static specs.login.LoginSpec.loginRequestSpec;
import static specs.login.LoginSpec.sucessfullLoginResponseSpec;
import static specs.logout.LogoutSpec.logoutResponseSpec;
import static specs.logout.LogoutSpec.logoutSpec;

public class LogoutTests extends TestBase{


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


        LogoutModel logoutData = new LogoutModel(refreshToken);
        // Создать модель и убрать в спецификацию
        //String logoutData = format("{\"refresh\": \"%s\"}", refreshToken);
                 given(logoutSpec)
                .body(logoutData)
                .when()
                .post("/auth/logout/")
                .then()
                         .spec(logoutResponseSpec);

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
