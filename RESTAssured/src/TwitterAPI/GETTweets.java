package TwitterAPI;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.sun.codemodel.JArray;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GETTweets {

	@Test
	public void GetTweets() {

		String customerkey = "4zsia8WfkYy0F3wzKZqR5gxFm",
				customerSecret = "kXcVygki6ZEB2JFgOqonXItUXyP8iMDIyb76EmV7CzxxBBElSD",
				accessToken = "1008579383215337472-9yx1zEbaKXPBMMGYiOldBxxOxIuCn6",
				accesssecret = "61LJBfLG13sUkcn01p6P2QjiXAHG5QNcwgRlwZj7UDXBB";

		RestAssured.baseURI = "https://api.twitter.com/1.1/statuses/";

		Response res = given().auth().oauth(customerkey, customerSecret, accessToken, accesssecret)
				.queryParam("count", "2").when().get("home_timeline.json").then().and().statusCode(200)
				.contentType(ContentType.JSON).extract().response();

		String tectresponse = res.asString();
		JsonPath js = new JsonPath(tectresponse);
		//String tweet = js.getString("text");
		System.out.println("id " + js.get("text"));
		//System.out.println(tweet);

		System.out.println("Compkertde");

	}
}
