package DifferentWaysToPostRequest;

import org.testng.annotations.Test;

import genericLibrary.javaLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import pojoClass.createProject;

public class createProjWithPojo
{
	@Test
	
		public void createProjTest()
		{
			javaLibrary jlib=new javaLibrary();
			createProject pObj = new createProject("sachin", "TYSS"+jlib.getRandomNum(), "completed", 12);
			
			given()
			.body(jlib)
			.contentType(ContentType.JSON)
			
			.when().post("http://localhost:8084/addProject")
			.then().assertThat().statusCode(201);
			
		}
	
}
