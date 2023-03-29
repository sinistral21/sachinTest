package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;

public class FormParameter {
	@Test
	public void formPara() {
		
		given().formParam("createdBy", "sachin")
		.formParam("projectName", "sa-01")
		.formParam("status", "ongoing")
		.formParam("teamSize", 12)
		.contentType(ContentType.JSON)
		
		.when().post("http://localhost:8084/addProject")
		
		.then().assertThat().statusCode(201).log().all();
		
		
		
	}

}
