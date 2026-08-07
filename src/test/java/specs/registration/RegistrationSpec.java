package specs.registration;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.CoreMatchers;

import static io.restassured.RestAssured.with;
import static io.restassured.filter.log.LogDetail.ALL;
import static io.restassured.http.ContentType.JSON;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.notNullValue;

public class RegistrationSpec {
    public static RequestSpecification registrationRequestSpec = with()
            .log().all()
            .contentType(JSON)
            .basePath("api/v1");

    public static ResponseSpecification sucessfullRegistrationResponseSpec = new ResponseSpecBuilder()
            .log(ALL)
            .expectStatusCode(201)
            .expectBody(matchesJsonSchemaInClasspath(
                    "schemas/registration/successful_registration_response_schema.json"))
            .expectBody("username", CoreMatchers.notNullValue())
            .expectBody("id", CoreMatchers.notNullValue())
            .expectBody("remoteAddr", CoreMatchers.notNullValue())
            .build();

    public static ResponseSpecification existingUserRegistrationErrorSpec = new ResponseSpecBuilder()
            .log(ALL)
            .expectStatusCode(400)
            .expectBody(matchesJsonSchemaInClasspath(
                    "schemas/registration/existing_user_registration_response_schema.json"))
            .expectBody("username", CoreMatchers.notNullValue())
            .build();


}
