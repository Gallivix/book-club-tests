
import models.lombok.RegistrationBodyLombokModel;
import models.lombok.RegistrationResponceLombokModel;
import models.pojo.RegistrationBodyPojoModel;
import models.pojo.RegistrationResponcePojoModel;
import models.records.*;
import net.datafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RegistrationTests {

    String username;
    String password;

    @BeforeEach
    public void prepareTestData() {
        Faker faker = new Faker();
        username = faker.name().firstName() + "_" + System.currentTimeMillis();
        password = faker.regexify("[A-Za-z0-9!@#$%^&*]{8,16}");

    }
    @Test
    public void successfulRegistrationTest_bad_practice() {

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

        RegistrationBodyPojoModel data = new RegistrationBodyPojoModel();
       // RegistrationBodyPojoModel data = new RegistrationBodyPojoModel(username, password);
        data.setUsername(username);
        data.setPassword(password);


        RegistrationResponcePojoModel registrationResponse = given()
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

        assertEquals(username, registrationResponse.getUsername());
    }


    @Test
    public void successfulRegistrationTest_with_lombok() {

        RegistrationBodyLombokModel data = new RegistrationBodyLombokModel();

        //RegistrationBodyLombokModel data = new RegistrationBodyLombokModel(username, password);
        data.setUsername(username);
        data.setPassword(password);


        RegistrationResponceLombokModel registrationResponse = given()
                .log().all()
                .contentType(JSON)
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(201)
                .extract()
                .as(RegistrationResponceLombokModel.class);

        assertEquals(username, registrationResponse.getUsername());
    }

    @Test
    public void successfulRegistrationTest_with_records() {

        RegistrationBodyRecordsModel data = new RegistrationBodyRecordsModel(username, password);

        RegistrationResponceRecordsModel registrationResponse = given()
                .log().all()
                .contentType(JSON)
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(201)
                .extract()
                .as(RegistrationResponceRecordsModel.class);

        assertEquals(username, registrationResponse.username());
    }


    @Test
    public void existingUser400Test() {

        RegistrationBodyRecordsModel data = new RegistrationBodyRecordsModel(username, password);

        // Первый запрос — успешная регистрация
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

        ExistingUser400ResponceRecordsModel response = given()
                .log().all()
                .contentType(JSON)
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(400)
                .extract()
                .as(ExistingUser400ResponceRecordsModel.class);

        String expectedError = "A user with that username already exists.";
        assertEquals(expectedError, response.username().get(0));
    }

    @Test
    public void invalidUsername400Test() {

        RegistrationBodyRecordsModel data = new RegistrationBodyRecordsModel("", password);
        ExistingUser400ResponceRecordsModel response = given()
                .log().all()
                .contentType(JSON)
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(400)
                .extract()
                .as(ExistingUser400ResponceRecordsModel.class);
        String expectedError = "This field may not be blank.";
        assertEquals(expectedError, response.username().get(0));
    }

    @Test
    public void usernameExceedsMaxLength400Test() {

        String username = RandomStringUtils.randomAlphanumeric(250);
        RegistrationBodyRecordsModel data = new RegistrationBodyRecordsModel(username, password);
        ExistingUser400ResponceRecordsModel response = given()
                .log().all()
                .contentType(JSON)
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(400)
                .extract()
                .as(ExistingUser400ResponceRecordsModel.class);
        String expectedError = "Ensure this field has no more than 150 characters.";
        assertEquals(expectedError, response.username().get(0));
    }

    @Test
    public void setPasswordExceedsMaxLength400Test() {

        String password = RandomStringUtils.randomAlphanumeric(250);
        RegistrationBodyRecordsModel data = new RegistrationBodyRecordsModel(username, password);
        ExistingPassword400ResponceRecordsModel response = given()
                .log().all()
                .contentType(JSON)
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(400)
                .extract()
                .as(ExistingPassword400ResponceRecordsModel.class);
        String expectedError = "Ensure this field has no more than 128 characters.";
        assertEquals(expectedError, response.password().get(0));
    }

    @Test
    public void invalidPasswordUser400Test() {

        RegistrationBodyRecordsModel data = new RegistrationBodyRecordsModel("", "");
        MissingFieldsResponseModel response = given()
                .log().all()
                .contentType(JSON)
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(400)
                .extract()
                .as(MissingFieldsResponseModel.class);
        String expectedError = "This field may not be blank.";
        assertEquals(expectedError, response.username().get(0));
        assertEquals(expectedError, response.password().get(0));
    }


    @Test
    public void missingUsernameAndPassword400Test() {

        RegistrationBodyRecordsModel data = new RegistrationBodyRecordsModel(username, "");
        ExistingPassword400ResponceRecordsModel response = given()
                .log().all()
                .contentType(JSON)
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(400)
                .extract()
                .as(ExistingPassword400ResponceRecordsModel.class);
        String expectedError = "This field may not be blank.";
        assertEquals(expectedError, response.password().get(0));
    }
    @Test
    public void unsupportedMediaType415Test() {

        RegistrationBodyRecordsModel data = new RegistrationBodyRecordsModel(username, password);

        given()
                .log().all()
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(415)
                .body("detail", is("Unsupported media type \"text/plain; charset=ISO-8859-1\" in request."));
    }
}