package RESTAssured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class GETRequest {

	public static void main(String[] args) {
		RestAssured.basePath = "https://reqres.in";
		
		given().when().post("/api/unknown/4").then().and().statusCode(403);
		System.out.println("heleo");

	}
}
