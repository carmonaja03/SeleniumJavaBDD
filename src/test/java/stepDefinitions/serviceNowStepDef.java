package stepDefinitions;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import microsoft.exchange.webservices.data.property.complex.UserId;
import org.hamcrest.CoreMatchers.*;
import org.testng.Assert;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class serviceNowStepDef {
    private static final String USER_ID = "";
    private static final String EMAIL = "eve.holt@reqres.in";
    private static final String PASSWORD = "cityHyd";
    private static final String BASE_URL = "https://reqres.in/api";
    private static final String BASE_URL_NEW = "https://reqres.in/api";

    private static String token;
    private static Response response;
    private static Response responseNew;
    private static String jsonString;
    private static String jsonStringNew;
    private static String userID;
    private static String userName;

    @Given("Test endpoint")
    public void test_endpoint() {
        System.out.println("test");

    }

    @Given("I am an authorized user")
    public void iAmAnAuthorizedUser() {
        RestAssured.baseURI = BASE_URL;
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");

        response = request.body("{\"email\":\"" +EMAIL+"\",\"password\": \""+PASSWORD+"\"}").post("/login");
        String jsonString  = response.asString();
        token = JsonPath.from(jsonString).get("token");

    }

    @Given("I set the user service api endpoint")
    public void iSetTheUserServiceApiEndpoint() {
        String BaseURL = BASE_URL;
        System.out.println(BaseURL);
    }


    @When("User makes a GET call to the endpoint {string}")
    public void userMakesAGETCallToTheEndpoint(String uri) {
        RestAssured.baseURI = BASE_URL;
        RequestSpecification request = RestAssured.given();
        response  = request.get(uri);
        jsonString = response.asString();
        System.out.println(response.getStatusCode());

    }


    @Then("The list of users should be populated")
    public void theListOfUsersShouldBePopulated() {

        System.out.println(jsonString.toString());

        List<Map<String, String>> usersEmail = response.getBody().jsonPath().get("data.email");
        Assert.assertTrue(usersEmail.size() > 0);
        System.out.println(usersEmail);
    }

    @And("check the status code to be {int}")
    public void checkTheStatusCodeToBe(int statusCode) {
        int actualStatusCode = response.getStatusCode();
        System.out.println("Actual status code is: "+actualStatusCode);
        Assert.assertEquals(statusCode,actualStatusCode);
    }

    @When("User makes a POST call on {string}")
    public void userMakesAPOSTCallOn(String uri) {
        RestAssured.baseURI = BASE_URL;
        RequestSpecification request  = RestAssured.given();
        request.header("Authorization","Bearer "+token).header("Content-Type","application/json");

        response = request.body("{ \"name\": \"Vinay555\", \"job\": \"Software Engineer\"}").post(uri);
        jsonString = response.asString();

    }

    @Then("User should be added")
    public void userShouldBeAdded() {
        String idName = String.valueOf(response.toString().contains("Vinay"));
        System.out.println(idName);
        userID = response.getBody().jsonPath().get("id");
        String userName = response.getBody().jsonPath().get("name");
        System.out.println("Username added is:"+userName+ " and its id is: "+userID);
        Assert.assertEquals(userName, "Vinay555");
        Assert.assertTrue(userID !=null);

    }

    @When("User makes a PUT call on {string}")
    public void userMakesAPUTCallOn(String uri) throws FileNotFoundException {
        RestAssured.baseURI = BASE_URL;
        RequestSpecification request  = RestAssured.given();
        request.header("Authorization","Bearer "+token).header("Content-Type","application/json");
        JsonParser jsonP = new JsonParser();
        JsonObject jsonO = (JsonObject) jsonP.parse(new FileReader("src/test/resources/testDataFolder/testData.json"));
        String abc = String.valueOf(jsonO.get("toPUT"));
        response = request.body(abc).put(uri);
        response.getBody().jsonPath().get("data.first_name");

        /*response = request.body("{\n" +
                "    \"data\": {\n" +
                "        \"id\": 1,\n" +
                "        \"email\": \"george.bluth@reqres.in\",\n" +
                "        \"first_name\": \"Vinay 511\",\n" +
                "        \"last_name\": \"Bluth\",\n" +
                "        \"avatar\": \"https://reqres.in/img/faces/1-image.jpg\"\n" +
                "    },\n" +
                "    \"support\": {\n" +
                "        \"url\": \"https://reqres.in/#support-heading\",\n" +
                "        \"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"\n" +
                "    }\n" +
                "}").put(uri);*/
        //request.body(jsonO.get("toPUT")).put(uri);
        //response = request.body(jsonO.put(uri);
        jsonString = response.asString();
    }

    @Then("Individual user should be populated")
    public void individualUserShouldBePopulated() {

        System.out.println(jsonString.toString());

        Map<String, String> usersData = response.getBody().jsonPath().get("data");
        String abc = usersData.get("last_name");
        System.out.println(abc);
        System.out.println(usersData);
        //Assert.assertEquals();
    }

    @Then("User should be Edited")
    public void userShouldBeEdited() {
        //response.asString().contains("Vinay 511")
        int userID = response.getBody().jsonPath().get("data.id");
        userName = response.getBody().jsonPath().get("data.first_name");;
        System.out.println("Username added is:"+userName+ " and its id is: "+userID);
        Assert.assertEquals(userName, "Vinay 111");
        Assert.assertTrue(userID > 0);
    }

    @When("User makes a DELETE call on {string}")
    public void userMakesADELETECallOn(String uri) {
        RestAssured.baseURI = BASE_URL;
        RequestSpecification request = RestAssured.given();
        uri.replace("id", "");
        uri = uri+userID;
        response  = request.delete(uri);
        jsonString = response.asString();
        System.out.println(response.getStatusCode());
        jsonString = response.asString();
    }

    @Then("User should be deleted and status code should be {int}")
    public void userShouldBeDeletedAndStatusCodeShouldBe(int statusCode) {
        int actualStatusCode = response.getStatusCode();
        System.out.println("Actual status code is: "+actualStatusCode);
        Assert.assertEquals(statusCode,actualStatusCode);
    }

    @Then("The list of users should be populated{int}")
    public void theListOfUsersShouldBePopulated(int arg0) {

    }
}
