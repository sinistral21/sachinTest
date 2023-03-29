package CRUDWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibrary.JavaLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProject {
	
	@Test
	public void createProj() {
		
		baseURI="http://rmgtestingserver";
		port=8084;
		JavaLibrary jlib=new JavaLibrary();
		
		JSONObject jObj=new JSONObject();

		jObj.put("createdBy", "sachu");
		jObj.put("projectName", "Xylem12"+jlib.getRandomNum());
		jObj.put("status", "Completed");
		jObj.put("teamSize", 12);
		
		//Step1: Pre condition
		given().body(jObj).contentType(ContentType.JSON)
		
		//Step2: actions
		.when().post("/addProject")
		
		//Step3: validation
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
				
	}

}
