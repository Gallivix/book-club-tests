package specs.logout;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static specs.BaseSpec.requestSpec;
import static specs.BaseSpec.responseSpecBuilder;

public class LogoutSpec {

    public static RequestSpecification logoutRequestSpec = requestSpec;

    public static ResponseSpecification sucessfullLogoutResponseSpec = responseSpecBuilder()
            .expectStatusCode(200)
            .expectBody(matchesJsonSchemaInClasspath(
                    "schemas/logout/successful_logout_response_schema.json"))
            .build();
}
