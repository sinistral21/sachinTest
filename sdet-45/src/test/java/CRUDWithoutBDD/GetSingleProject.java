package CRUDWithoutBDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSingleProject {
	@Test
	
public void getSingleProject() {
		
		//Step 1: Create a pre requisite
		
		//Step 2: Perform the action
			Response resp = RestAssured.get("http://rmgtestingserver:8084/projects/TY_PROJ_9840");
					
		//Step 3: Provide Validation
				resp.then().log().all();
				int actStatus = resp.getStatusCode();
				Assert.assertEquals(200, actStatus);
		
	}

}
