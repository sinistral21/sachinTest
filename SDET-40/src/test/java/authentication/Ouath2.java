package authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Ouath2 {
	
	@Test
	public void ouath() {
		baseURI="http://coop.apps.symfonycasts.com";
		 Response resp = given()
		.formParam("client_id", "sdet-40")
		.formParam("client_secret", "8e2c60d68f5dfd6117525aa7c887f423")
		.formParam("grant_type", "client_credentials")
		.formParam("redirect_uri", "http://example.com")
		.formParam("code", "authorization_code")
		
		.when().post("http://coop.apps.symfonycasts.com/token");
		String token = resp.jsonPath().get("access_token");
		
		given().auth().oauth2(token)
		//.pathParam("userId", 4011)
		.when().post("/api/4011/eggs-collect")
		.then().assertThat().log().all();
		
		
		
		
		
	}

}
