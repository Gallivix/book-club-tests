package specs.logout;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.with;
import static io.restassured.filter.log.LogDetail.ALL;
import static io.restassured.http.ContentType.JSON;


public class LogoutSpec {

    public static RequestSpecification logoutSpec = with()
            .log().all()
            .contentType(JSON)
            .basePath("api/v1");

    public static ResponseSpecification logoutResponseSpec = new ResponseSpecBuilder()
            .log(ALL)
            .expectStatusCode(200)
            .build();

}
