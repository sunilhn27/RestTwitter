package TwitterAPI;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateTweet {

	@Test
	public void createtweet() {
		String customerkey = "4zsia8WfkYy0F3wzKZqR5gxFm",
				customerSecret = "kXcVygki6ZEB2JFgOqonXItUXyP8iMDIyb76EmV7CzxxBBElSD",
				accessToken = "1008579383215337472-9yx1zEbaKXPBMMGYiOldBxxOxIuCn6",
				accesssecret = "61LJBfLG13sUkcn01p6P2QjiXAHG5QNcwgRlwZj7UDXBB";

		RestAssured.baseURI = "https://api.twitter.com/1.1/statuses";
		System.out.println("af");
		given().auth().oauth(customerkey, customerSecret, accessToken, accesssecret).queryParam("status", "Hi mohammad")
				.when().post("/update.json").then().assertThat().statusCode(200);
		System.out.println("Created");
	}
}
