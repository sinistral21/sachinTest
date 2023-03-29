package CRUDWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibrary.JavaLibrary;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject {
	@Test
	
	public void createProj() {
		
		
		//Step 1: Create the pre requisites - request Body
		JSONObject jObj=new JSONObject();
		JavaLibrary jlib=new JavaLibrary();

		jObj.put("createdBy", "sachu");
		jObj.put("projectName", "Xylem12"+jlib.getRandomNum());
		jObj.put("status", "Completed");
		jObj.put("teamSize", 12);
		
		
		//Step 2: Perform the Action
		RequestSpecification req = RestAssured.given();
		req.body(jObj);
		req.contentType(ContentType.JSON);
		
		Response resp = req.post("http://rmgtestingserver:8084/addProject");
		
		//Step 3: Validate the response
		System.out.println(resp.contentType());
		System.out.println(resp.prettyPrint());
		System.out.println(resp.prettyPeek());
		System.out.println(resp.asString());
		
		
	}

}
