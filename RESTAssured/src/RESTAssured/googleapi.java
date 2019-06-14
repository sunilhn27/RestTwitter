package RESTAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class googleapi {

	@Test
	public static void rest() {
		RestAssured.baseURI = "https://maps.googleapis.com";

		given().param("location", "-33.8670522,151.1957362").param("radius", "500").param("type", "hospital")
				.param("key", "AIzaSyCHkhjN8WFNyHzeVDMGfAgXTf1gEpVX2hw");
		when().get("/maps/api/place/nearbysearch/json").then().assertThat().contentType(ContentType.JSON)
				.statusCode(200).and().body("results[0].name", equalTo("Pyrmont Doctors"));
		System.out.println("pass");

	}
}