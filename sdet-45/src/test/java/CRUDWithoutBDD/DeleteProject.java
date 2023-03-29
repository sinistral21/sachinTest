package CRUDWithoutBDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProject {
	
	@Test

	public void deleteProj() {
		//Step 1: Create Prerequities
	    //STep 2: Perform Action
			Response resp = RestAssured.delete("http://rmgtestingserver:8084/projects/TY_PROJ_9777");
				
		//Step3: validate
			resp.then().log().all();
			int actStatus = resp.getStatusCode();
			Assert.assertEquals(actStatus, 204);
		
	}
}
