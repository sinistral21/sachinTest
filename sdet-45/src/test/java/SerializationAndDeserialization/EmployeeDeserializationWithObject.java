package SerializationAndDeserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOClass.EmployeeWithObject;

public class EmployeeDeserializationWithObject {
	
	@Test
	public void emplDeserObj() throws Throwable {
		
		ObjectMapper omap=new ObjectMapper();
		
		EmployeeWithObject data=omap.readValue(new File("./emp2.json"), EmployeeWithObject.class);
		
		System.out.println(data.getSpouse().getPhone()[1]);
	
	}

	
}
