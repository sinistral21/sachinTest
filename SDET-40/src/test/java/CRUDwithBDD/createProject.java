package CRUDwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.inject.matcher.Matchers;

import genericLibrary.javaLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class createProject {
	
	@Test
	public void createProjTest()
	{
		baseURI="http://localhost";
		port=8085;
		JSONObject jObj = new JSONObject();
		javaLibrary jlib = new javaLibrary();

		jObj.put("createdBy", "sachin");
		jObj.put("projectName", "Xylem"+jlib.getRandomNum());
		jObj.put("status", "Completed");
		jObj.put("teamSize", 15);
		
		//Step-1: pre conditions
		given()
		.body(jObj)
		.contentType(ContentType.JSON)
		
		//step-2: actions or executions
		
		.when()
		.post("/addProject")
		
		//step-3: validation
		.then()
		.assertThat().time(org.hamcrest.Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
		.log()
		.all();
		
		
	}

}
