package parameters;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class pathParameterToUpdateProject {
	
	@Test
	public void pathParaTest() {
		
		baseURI="http://localhost";
		port=8085;
		
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy", "sachin");
		jObj.put("projectName", "Xylem");
		jObj.put("status", "on-going");
		jObj.put("teamSize", 12);
		
		given()
		 .body(jObj)
		 .contentType(ContentType.JSON)
		 .pathParam("pid", "TY_PROJ_8010")
		 
		.when()
		  .put("/projects/{pid}")
		  
		.then()
		 .assertThat().log().all();
		
	}

}
