package CRUDWithBDD;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class GetAllProjects {
	
	@Test
	
	public void getAllProj() {
		
		when().get("http://rmgtestingserver:8084/projects")
		.then().assertThat().time(Matchers.lessThan(5000L),TimeUnit.MILLISECONDS).log().all();
	}

}
