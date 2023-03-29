package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParameter {
	
	@Test
	
	public void path() {
		
		given().pathParam("pid", "TY_PROJ_9578")
		.when().get("http://rmgtestingserver:8084/projects/{pid}")
		.then().assertThat().statusCode(200).log().all();
	}

}
