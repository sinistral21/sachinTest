package CRUDWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProject {
	@Test
	public void updatProj() {
		//Step1: create pre requisites
				JSONObject jObj = new JSONObject();
				jObj.put("createdBy", "Chaitra");
				jObj.put("projectName", "Xylem1");
				jObj.put("status", "Completed");
				jObj.put("teamSize", 15);
				
				RequestSpecification req = RestAssured.given();
				req.body(jObj);
				req.contentType(ContentType.JSON);
				
				//Step2: perform action
				Response resp = req.put("http://rmgtestingserver:8084/projects/TY_PROJ_9777");
				
				//Step 3: Validation
				resp.then().log().all();
				int actStatus = resp.getStatusCode();
				Assert.assertEquals(actStatus, 200);
	}

}
