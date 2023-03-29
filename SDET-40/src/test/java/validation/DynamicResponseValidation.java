package validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.nio.file.attribute.AclEntryFlag;
import java.util.List;

public class DynamicResponseValidation {
	@Test
	public void dynamicRespValidTest()
	{
		String expData="TY_PROJ_8009";
		baseURI="http://localhost";
		port=8084;
		
		Response resp = when().get("/projects");
		boolean flag = true;
		
		List<String> pIds = resp.jsonPath().get("projectId");
		
		for (String  projects : pIds)
		{
		if(projects.equalsIgnoreCase(expData))
		{
			flag=true;
		}
		}
		Assert.assertTrue(flag);
		System.out.println("TC pass");
		resp.then().log().all();
	}
	
}
	
