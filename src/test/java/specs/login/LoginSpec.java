package specs.login;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.notNullValue;
import static specs.BaseSpec.requestSpec;
import static specs.BaseSpec.responseSpecBuilder;

public class LoginSpec {
    public static RequestSpecification loginRequestSpec = requestSpec;

    public static ResponseSpecification sucessfullLoginResponseSpec = responseSpecBuilder()
            .expectStatusCode(200)
            .expectBody(matchesJsonSchemaInClasspath(
                    "schemas/login/successful_login_response_schema.json"))
            .expectBody("access", notNullValue())
            .expectBody("refresh", notNullValue())
            .build();

    public static ResponseSpecification wrongCredentialsLoginResponseSpec = responseSpecBuilder()
            .expectStatusCode(401)
            .expectBody(matchesJsonSchemaInClasspath(
                    "schemas/login/wrong_credentials_login_response_schema.json"))
            .expectBody("detail", notNullValue())
            .build();
}
