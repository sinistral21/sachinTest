import org.testng.annotations.Test;

import genericLibrary.javaLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import pojoClass.createProject;

public class requestChaining {

	@Test
	public void requestChain()
	{
		
		javaLibrary jlib=new javaLibrary();
		createProject cp=new createProject("sachi", "tyss-2107"+jlib.getRandomNum(), "completed", 12);
		baseURI="http://localhost";
		port=8084;
		Response resp = given()
				.body(cp)
				.contentType(ContentType.JSON)
		
		       .when()
		       .post("/addProject");
		

		String proId = resp.jsonPath().get("projectId");
		
		resp.then().assertThat().statusCode(201);
		
		
		when().get("projects/"+proId)
		.then().assertThat().statusCode(200).log().all();
		
	}
}
