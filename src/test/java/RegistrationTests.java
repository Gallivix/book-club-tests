
import models.pojo.RegistrationBodyPojoModel;
import models.pojo.RegistrationResponcePojoModel;
import net.datafaker.Faker;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RegistrationTests {

    @Test
    public void successfulRegistrationTest() {
        Faker faker = new Faker();
        String username = faker.name().firstName();
        String password = faker.name().firstName();

        String data = "{\"username\": \"" + username + "\", \"password\": \"" + password + "\"}";

        given()
                .log().all()
                .contentType(JSON)
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(201)
                .body("username", is(username))
                .body("id", notNullValue());
    }

    @Test
    public void successfulRegistrationTest_with_pojo() {
        Faker faker = new Faker();
        String username = faker.name().firstName();
        String password = faker.name().firstName();

        RegistrationBodyPojoModel data = new RegistrationBodyPojoModel();
        data.setUsername(username);
        data.setPassword(password);
        RegistrationResponcePojoModel registrationResponce = given()
                .log().all()
                .contentType(JSON)
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(201)
                .extract()
                .as(RegistrationResponcePojoModel.class);

        assertEquals(username, registrationResponce.getUsername());
    }

    @Test
    public void existingUser400Test() {
        Faker faker = new Faker();
        String username = faker.name().firstName();
        String password = faker.name().firstName();

        String data = String.format("{\"username\": \"%s\", \"password\": \"%s\"}", username, password);

        given()
                .log().all()
                .contentType(JSON)
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(201)
                .body("username", is(username))
                .body("id", notNullValue());

        given()
                .log().all()
                .contentType(JSON)
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(400)
                .body("username[0]", is("A user with that username already exists."));
    }

    @Test
    public void invalidUsername400Test() {
        Faker faker = new Faker();
        String username = faker.name().fullName();
        String password = faker.name().lastName();

        String data = String.format("{\"username\": \"%s\", \"password\": \"%s\"}", username, password);

        given()
                .log().all()
                .contentType(JSON)
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(400)
                .body("username", is(username))
                .body("id", notNullValue());
    }
    @Test
    public void unsupportedMediaType415Test() {
        Faker faker = new Faker();
        String username = faker.name().fullName();
        String password = faker.name().lastName();

        String data = String.format("{\"username\": \"%s\", \"password\": \"%s\"}", username, password);

        given()
                .log().all()
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(415)
                .body("username", is(username))
                .body("id", notNullValue());
    }
}