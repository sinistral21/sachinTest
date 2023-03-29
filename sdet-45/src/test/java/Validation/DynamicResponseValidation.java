package Validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicResponseValidation {
	
	@Test
	public void dynamicResp() {
		//pre-condition
		String expData = "TY_PROJ_11299";
		baseURI = "http://rmgtestingserver";
		port = 8084;
				
		//Action
		Response resp = when().get("/projects");
				
		//Validation
		boolean flag = false;
		List<String> pIDs = resp.jsonPath().get("projectId");
				for(String projectID : pIDs)
				{
					if(projectID.equalsIgnoreCase(expData))
					{
						flag = true;
					}
				}
				
				Assert.assertTrue(flag);
				System.out.println("data verfied");
				
				resp.then().statusCode(200).log().all();
	}

}
