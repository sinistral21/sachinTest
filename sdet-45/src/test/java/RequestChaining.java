import org.testng.annotations.Test;

import GenericLibrary.JavaLibrary;
import POJOClassToCreateProject.ProjectLibrary;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RequestChaining {

	
	@Test
	public void requestChaining() {
		
		//Step 1: create a project using POJO
		JavaLibrary jLib = new JavaLibrary();
		ProjectLibrary pLib = new ProjectLibrary("Sachin", "Fireflink "+jLib.getRandomNum(), "Completed", 24);
		baseURI = "http://rmgtestingserver";
		port = 8084;
				
		Response resp = given()
				       .body(pLib)
				       .contentType(ContentType.JSON)
				       .when()
				       .post("/addProject");
				
				//capture the project id
				String proId = resp.jsonPath().get("projectId");
				System.out.println(proId);
				resp.then().log().all();
				
				//Create a get request and pass proID as path parameter
			given()
			    .pathParam("pid", proId)
				.when()
				.get("/projects/{pid}")
				.then()
				.assertThat().statusCode(200).log().all();
		
		
	}
}
