package SerializationAndDeserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOClass.EmployeeWithArray;

public class EmployeeSerializationWithArray {
	@Test
	public void emplSerialArray() throws Throwable{
		
		
		int[] phno= {12345,5678};
		
		
		EmployeeWithArray emp=new EmployeeWithArray("sachi", phno);
		
		ObjectMapper omap=new ObjectMapper();
		
		omap.writeValue(new File("./emp1.json"), emp);
				
		
	}

}
