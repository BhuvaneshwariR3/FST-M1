package activities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Activity2 {
    final static String Root_URI = "https://petstore.swagger.io/v2/user";

    @Test(priority = 1)
    public void addUserFromFile() throws IOException{
        FileInputStream inputJSON = new FileInputStream("src/test/java/activities/userinfo.json");

        String requestBody = new String(inputJSON.readAllBytes());

        Response response = given().contentType(ContentType.JSON)
                .body(requestBody)
                .when().post(Root_URI);

        inputJSON.close();

        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("9901"));
    }

    @Test(priority = 2)
    public void getUserInfo(){
        File outputJSON = new File("src/test/java/activities/userGETResponse.json");

        Response response = given().contentType(ContentType.JSON)
                .pathParam("username", "justinc")
                .when().get(Root_URI + "/{username}");

        String responseBody = response.getBody().asPrettyString();

        try{
            outputJSON.createNewFile();

            FileWriter writer = new FileWriter(outputJSON.getPath());
            writer.write(responseBody);
            writer.close();

        }catch (IOException e){
            e.printStackTrace();
        }

        response.then().body("id", equalTo(9901));
        response.then().body("username", equalTo("justinc"));
        response.then().body("firstName", equalTo("Justin"));
        response.then().body("lastName", equalTo("Case"));
        response.then().body("email", equalTo("justincase@mail.com"));
        response.then().body("password", equalTo("password123"));
        response.then().body("phone", equalTo("9812763450"));
    }

    @Test(priority = 3)
    public void  deleteUser() throws IOException{
        Response response = given().contentType(ContentType.JSON)
                .pathParam("username", "justinc")
                .when().delete(Root_URI + "/{username}");

        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("justinc"));

    }
}
