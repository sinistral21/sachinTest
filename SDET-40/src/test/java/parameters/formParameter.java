
package parameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class formParameter {
	
	@Test
	public void formTest() {
		
		 baseURI="http://localhost";
		 port=8085;
		given()
		  .formParam("createdBy", "sachin")
		  .formParam("projectName", "tyss")
		  .formParam("status", "Completed")
		  .formParam("teamSize", 12)
		  .contentType(ContentType.JSON)
		
		
		.when()
		  .post("/addProject")
		  
		  
		.then().log().all();
	}

	}


