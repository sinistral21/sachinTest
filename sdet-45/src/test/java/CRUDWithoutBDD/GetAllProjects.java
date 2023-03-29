package CRUDWithoutBDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllProjects {
	@Test
	public void getAllProj() {
	
		//Step 1: Create a pre requisite
		
		//Step 2: Perform the action
		Response resp = RestAssured.get("http://localhost:8084/projects");
			
		//Step 3: Provide Validation
		resp.then().log().all();
		int actStatus = resp.getStatusCode();
		Assert.assertEquals(200, actStatus);
	}

}
