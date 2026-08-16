package tests;

import models.login.LoginBodyModel;
import models.login.SuccessfulLoginResponseModel;
import models.logout.LogoutModel;
import models.logout.SuccessfulLogoutResponseModel;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static specs.login.LoginSpec.*;
import static specs.logout.LogoutSpec.*;
import static tests.TestData.*;

public class LogoutTests extends TestBase {

    @Test
    public void sucessfullLogoutTest() {
        LoginBodyModel loginData = new LoginBodyModel(USERNAME, PASSWORD);

        SuccessfulLoginResponseModel loginResponse = given(loginRequestSpec)
                .body(loginData)
                .when()
                .post("/auth/token/")
                .then()
                .spec(sucessfullLoginResponseSpec)
                .extract()
                .as(SuccessfulLoginResponseModel.class);

        LogoutModel logoutData = new LogoutModel(loginResponse.refresh());

        given(logoutRequestSpec)
                .body(logoutData)
                .when()
                .post("/auth/logout/")
                .then()
                .spec(sucessfullLogoutResponseSpec)
                .extract()
                .as(SuccessfulLogoutResponseModel.class);
    }
}
