package SerializationAndDeserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOClass.Employee;

public class EmployeeDeserialization {
	@Test
	public void emplDese() throws Throwable {
		
		ObjectMapper omap=new ObjectMapper();
		
		Employee data=omap.readValue(new File("./emp.json"), Employee.class);
		
		System.out.println(data.getName());
		System.out.println(data.getPhno());
		System.out.println(data.getId());
	}

}
