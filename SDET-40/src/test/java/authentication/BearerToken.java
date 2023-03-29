package authentication;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;


import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerToken {

	@Test
	public void bearerToke() {
		
		baseURI="https://api.github.com";
	JSONObject jobj = new JSONObject();
	jobj.put("name", "SDet-42");
	
	given().auth().oauth2("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")
	.body(jobj).contentType(ContentType.JSON)
	
	.when().post("/user/repos")
	.then().assertThat().statusCode(201).log().all();
		
		
		
		
		
		
	}
}
