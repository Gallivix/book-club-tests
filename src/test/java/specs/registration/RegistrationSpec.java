package specs.registration;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.CoreMatchers.notNullValue;
import static specs.BaseSpec.requestSpec;
import static specs.BaseSpec.responseSpecBuilder;

public class RegistrationSpec {
    public static RequestSpecification registrationRequestSpec = requestSpec;

    public static ResponseSpecification sucessfullRegistrationResponseSpec = responseSpecBuilder()
            .expectStatusCode(201)
            .expectBody(matchesJsonSchemaInClasspath(
                    "schemas/registration/successful_registration_response_schema.json"))
            .expectBody("username", notNullValue())
            .expectBody("id", notNullValue())
            .expectBody("remoteAddr", notNullValue())
            .build();

    public static ResponseSpecification existingUserRegistrationErrorSpec = responseSpecBuilder()
            .expectStatusCode(400)
            .expectBody(matchesJsonSchemaInClasspath(
                    "schemas/registration/existing_user_registration_response_schema.json"))
            .expectBody("username", notNullValue())
            .build();
}
