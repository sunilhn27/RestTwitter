package TwitterAPI;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import Resourses.PayLoad;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GCSGet {

	@Test
	public void getGCS() {
		System.out.println("Hello");
		RestAssured.baseURI = "https://cfapp.invensys.com";
		Response res = given().headers("Authorization", PayLoad.getToken())
				.header("Content-Type", "application/x-www-form-urlencoded").when().get(PayLoad.getResourses()).then()
				.statusCode(200).extract().response();
		System.out.println(res.asString());
		System.out.println("heelo 1");

	}
}
