package validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticResponseValidationGet {
	@Test
	public void staticTest() {
		{
			//prerequisites
			String expData = "TY_PROJ_2403";
			baseURI = "http://localhost";
			port = 8084;
			
			//action
			Response resp = when()
					        .get("/projects");
			
			//validation
			String actData = resp.jsonPath().get("[0].projectId");
			Assert.assertEquals(actData, expData);
			System.out.println("data verfied ");
			
			resp.then().log().all();
		}
	}

}
