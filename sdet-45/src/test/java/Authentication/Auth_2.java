package Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Auth_2 {
	@Test
	public void auth2() {
		
		//Create a request to generate accesss token 
				Response resp = given()
				 .formParam("client_id", "sdet-4501")
				 .formParam("client_secret", "a03fa637ccd03043048b0886d5a9acf3")
				 .formParam("grant_type", "client_credentials")
				 .formParam("redirect_uri", "http://example.com")
				 .formParam("code", "authorization_code")
				 
			    .when()
			     .post("http://coop.apps.symfonycasts.com/token");
			     
			    //Capture the access token from the response of the above request
				String token = resp.jsonPath().get("access_token");
				System.out.println(token);
				
				
				//Create another request and use the token to access the APIs
				given()
				 .auth().oauth2(token)
				 .pathParam("USER_ID", 4333)
				 
				.when()
				 .post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count")
				 
				.then().log().all();
				 
	}

}
