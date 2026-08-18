package api;

import io.qameta.allure.restassured.AllureRestAssured;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.ResponseSpecification;
import models.login.LoginBodyModel;
import models.login.SuccessfulLoginResponseModel;
import models.login.WrongCredentialsLoginResponseModel;
import models.logout.LogoutModel;
import models.logout.SuccessfulLogoutResponseModel;
import models.registration.ExistingUserResponceModel;
import models.registration.RegistrationBodyModel;
import models.registration.SucessfulRegistrationResponceModel;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.CoreMatchers.notNullValue;

public class ApiClient {

    private final AllureRestAssured allureFilter;

    public ApiClient(String baseUrl) {
        this.allureFilter = createAllureFilter();
        RestAssured.baseURI = baseUrl;
    }

    private AllureRestAssured createAllureFilter() {
        AllureRestAssured filter = new AllureRestAssured();
        filter.setRequestTemplate("request.ftl");
        filter.setResponseTemplate("response.ftl");
        return filter;
    }

    private ValidatableResponse post(String path, Object body) {
        return RestAssured.given()
                .filter(allureFilter)
                .log().all()
                .contentType(ContentType.JSON)
                .basePath("api/v1")
                .body(body)
                .when()
                .post(path)
                .then()
                .log().all();
    }

    @Step("Авторизация и получение токена")
    public SuccessfulLoginResponseModel login(String username, String password) {
        LoginBodyModel body = new LoginBodyModel(username, password);

        return post("/auth/token/", body)
                .spec(sucessfullLoginResponseSpec())
                .extract()
                .as(SuccessfulLoginResponseModel.class);
    }

    public WrongCredentialsLoginResponseModel loginWithInvalidCredentials(String username, String password) {
        LoginBodyModel body = new LoginBodyModel(username, password);

        return post("/auth/token/", body)
                .spec(wrongCredentialsLoginResponseSpec())
                .extract()
                .as(WrongCredentialsLoginResponseModel.class);
    }

    @Step("Отправка запроса logout с refresh-токеном")
    public SuccessfulLogoutResponseModel logout(String refreshToken) {
        LogoutModel body = new LogoutModel(refreshToken);

        return post("/auth/logout/", body)
                .spec(sucessfullLogoutResponseSpec())
                .extract()
                .as(SuccessfulLogoutResponseModel.class);
    }

    public SucessfulRegistrationResponceModel register(String username, String password) {
        RegistrationBodyModel body = new RegistrationBodyModel(username, password);

        return post("/users/register/", body)
                .spec(sucessfullRegistrationResponseSpec())
                .extract()
                .as(SucessfulRegistrationResponceModel.class);
    }

    public ExistingUserResponceModel registerExistingUser(String username, String password) {
        RegistrationBodyModel body = new RegistrationBodyModel(username, password);

        return post("/users/register/", body)
                .spec(existingUserRegistrationErrorSpec())
                .extract()
                .as(ExistingUserResponceModel.class);
    }

    private ResponseSpecification sucessfullLoginResponseSpec() {
        return new io.restassured.builder.ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectBody(matchesJsonSchemaInClasspath(
                        "schemas/login/successful_login_response_schema.json"))
                .expectBody("access", notNullValue())
                .expectBody("refresh", notNullValue())
                .build();
    }

    private ResponseSpecification wrongCredentialsLoginResponseSpec() {
        return new io.restassured.builder.ResponseSpecBuilder()
                .expectStatusCode(401)
                .expectBody(matchesJsonSchemaInClasspath(
                        "schemas/login/wrong_credentials_login_response_schema.json"))
                .expectBody("detail", notNullValue())
                .build();
    }

    private ResponseSpecification sucessfullLogoutResponseSpec() {
        return new io.restassured.builder.ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectBody(matchesJsonSchemaInClasspath(
                        "schemas/logout/successful_logout_response_schema.json"))
                .build();
    }

    private ResponseSpecification sucessfullRegistrationResponseSpec() {
        return new io.restassured.builder.ResponseSpecBuilder()
                .expectStatusCode(201)
                .expectBody(matchesJsonSchemaInClasspath(
                        "schemas/registration/successful_registration_response_schema.json"))
                .expectBody("username", notNullValue())
                .expectBody("id", notNullValue())
                .expectBody("remoteAddr", notNullValue())
                .build();
    }

    private ResponseSpecification existingUserRegistrationErrorSpec() {
        return new io.restassured.builder.ResponseSpecBuilder()
                .expectStatusCode(400)
                .expectBody(matchesJsonSchemaInClasspath(
                        "schemas/registration/existing_user_registration_response_schema.json"))
                .expectBody("username", notNullValue())
                .build();
    }
}