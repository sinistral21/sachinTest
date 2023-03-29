package parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class queryParameter {
	
	@Test
	public void queryPara() {
		
		baseURI = "https://reqres.in";
		
		given().queryParam("page", 3)
		
		
		.when().get("/api/users")
		
		.then().assertThat().statusCode(200).log().all();
		
	}

}
