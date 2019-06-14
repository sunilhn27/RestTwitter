package API;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.CoreMatchers.equalTo;

public class googleapi {

	@Test
	public static void rest() throws Exception {
		RestAssured.baseURI = "https://maps.googleapis.com";
		Response res = given().param("location", "12.924522,77.678612").param("radius", "500")
				.param("key", "AIzaSyCHkhjN8WFNyHzeVDMGfAgXTf1gEpVX2hw").when().get("/maps/api/place/nearbysearch/json")
				.then().assertThat().contentType(ContentType.JSON).statusCode(200).extract().response();
		System.out.println("pass");

		JsonPath js = new JsonPath(res.asString());
		int value = js.getInt("results.size()");
		System.out.println("Total value =" + value);
		String text = js.getString("results[0].geometry.viewport.southwest.lat");
		String vicinity = js.getString("results[0].vicinity");
		System.out.println("Vivinity " + vicinity);
		System.out.println("Text is " + text);
		for (int i = 0; i < value; i++) {
			String vic = js.getString("results[" + i + "].vicinity");
			String name = js.getString("results[" + i + "].name");

			System.out.println("VIC " + vic);
			System.out.println("name :" + name);
		}

	}
}
