package SerializationAndDeserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOClass.EmployeeWithArray;

public class EmployeeDeserializationWithArray {
	@Test
	public void EmpDesrArray() throws Throwable {
		
		ObjectMapper omap=new ObjectMapper();
		EmployeeWithArray data=omap.readValue(new File("./emp1.json"), EmployeeWithArray.class);
		System.out.println(data.getName());
		System.out.println(data.getPhno()[1]);
		
	}
}
