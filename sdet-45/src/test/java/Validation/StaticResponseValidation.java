package Validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticResponseValidation {
	
	@Test
	public void staticValid() {
		
		//pre-condition
		String expData = "TY_PROJ_11289";
		baseURI = "http://rmgtestingserver";
		port = 8084;
				
		//action
		Response resp = when()
						.get("/projects");
				
		//validation
		String actData = resp.jsonPath().get("[1].projectId");
		Assert.assertEquals(actData, expData);
		System.out.println("data is verfied ");
				
		resp.then().log().all();
			
	}

}
