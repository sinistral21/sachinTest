package parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class pathParametertoDeleteProject
{
@Test
public void pathTest() {
	
	baseURI="http://localhost";
	port=8085;
	given().pathParam("pid", "TY_PROJ_8006")
	.when().delete("/projects/{pid}")
	.then().assertThat().statusCode(204);
}
}
