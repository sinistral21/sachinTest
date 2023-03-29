package parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class formParameterForGit {

	@Test
	public void formTest() {
		
baseURI ="https://api.github.com";
		
		given()
		 .pathParam("username", "Chaitra9632")
		 .queryParam("per_page", 30)
		 .queryParam("page", 1)
		 
		.when()
		 .get("/users/{username}/repos")
		 
		.then().assertThat().statusCode(200).log().all();
	}
}
