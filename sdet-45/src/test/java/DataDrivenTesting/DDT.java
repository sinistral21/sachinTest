package DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericLibrary.JavaLibrary;
import POJOClassToCreateProject.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DDT {


	 
	@Test(dataProvider = "getData")
	public void createProject(String createdBy, String projectName, String status, int teamSize)
	{
		
		//Pre-condition
		JavaLibrary jLib = new JavaLibrary();
		ProjectLibrary pLib = new ProjectLibrary(createdBy, projectName+jLib.getRandomNum(), status, teamSize);
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		
		given()
		 .body(pLib)
		 .contentType(ContentType.JSON)
	   
		//Actions
		.when()
		 .post("/addProject")
		 
		//Validation
		.then().log().all();
		
		
	}
	
	
	@DataProvider(name = "getData")
	public Object[][] data()
	{
		Object[][] data = new Object[3][4];
		
		data[0][0] = "sachin";
		data[0][1] = "tyss";
		data[0][2] = "Completed";
		data[0][3] = 12;
		
		data[1][0] = "sanju";
		data[1][1] = "wipro";
		data[1][2] = "Created";
		data[1][3] = 15;
		
		data[2][0] = "mithun";
		data[2][1] = "TYSS";
		data[2][2] = "On Going";
		data[2][3] = 20;
		
		
		return data;
	}

}
