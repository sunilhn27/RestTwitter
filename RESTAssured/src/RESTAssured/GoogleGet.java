package RESTAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GoogleGet {

	@Test
	public void getGoogle() {
		System.out.println("Hello");

		RestAssured.baseURI = "https://maps.googleapis.com";
		System.out.println("heelo 1");
		given().param("location", "-33.8670522,151.1957362").param("radius", "1500")
				.param("key", "AIzaSyCHkhjN8WFNyHzeVDMGfAgXTf1gEpVX2hw").when().get("/maps/api/place/nearbysearch/json")
				.then().assertThat().statusCode(200);
		System.out.println("uyguyfuy");
	}

}
