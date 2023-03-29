package parameters;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;

public class pathParameterToGetSingleProject
{

	
	@Test
	public void pathTest() {
		baseURI="http://localhost";
		port=8085;
		 given().pathParam("pid", "TY_PROJ_8011")
		 
		 .when().get("/projects/{pid}")
		 
		 .then().assertThat().statusCode(200);
		
		
	}
}
