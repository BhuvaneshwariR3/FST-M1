package activities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Activity1 {

    final static String Root_URI = "https://petstore.swagger.io/v2/pet";

    @Test(priority = 1)
    public void post(){
        String requestBody = "{\"id\": 77232,\"name\": \"Riley\",\"status\": \"alive\"}";

        Response response =
                given().contentType(ContentType.JSON)
                        .body(requestBody)
                        .when().post(Root_URI);

        response.then().body("id",equalTo(77232));
        response.then().body("name", equalTo("Riley"));
        response.then().body("status", equalTo("alive"));
    }

    @Test(priority = 2)
    public void getRequest(){
        Response response =
                given().contentType(ContentType.JSON)
                        .when().pathParam("petID", "77232")
                        .get(Root_URI + "/{petID}");

        response.then().body("id", equalTo(77232));
        response.then().body("name", equalTo("Riley"));
        response.then().body("status", equalTo("alive"));
    }

    @Test(priority = 3)
    public void deleteRequest(){
        Response response =
                given().contentType(ContentType.JSON)
                        .when().pathParam("petID", "77232")
                        .delete(Root_URI + "/{petID}");

        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("77232"));
    }
}
