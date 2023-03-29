package CRUDwithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class getAllProject {
	
	@Test
	public void getAllProjTest() {
		when().get("http://localhost:8084/projects")
		.then().assertThat().statusCode(200).log().all();
		
		
	}

}
