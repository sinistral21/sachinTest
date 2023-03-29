package DifferentWaysToPostARequest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class JsonFile {
	
	@Test
	public void jsonFile() {
		
	//	File file=new File("./data.json");
		
		given().log().all().body("{\r\n"
				+ "  \"createdBy\": \"sahinjkk\",\r\n"
				+ "  \"projectName\": \"sasd\",\r\n"
				+ "  \"status\": \"asd\",\r\n"
				+ "  \"teamSize\": 12\r\n"
				+ "}").contentType(ContentType.JSON)
		.when().post("http://rmgtestingserver:8084/addProject")
		.then().assertThat().statusCode(201).log().all();
		
	}

}
