package API;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class getOne {

	@Test
	public void get() {
		RestAssured.baseURI = "https://reqres.in";
		Response res = given().when().get("/api/unknown/4").then().and().statusCode(200).extract().response();
		JsonPath js = new JsonPath(res.asString());
		System.out.println(res.asString());
		String name =js.getString("data.name");
		String id =js.getString("data.id");
		System.out.println("name "+name);
		System.out.println("id " +id);
		

	}
}
