package SerializationAndDeserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOClass.EmployeeWithObject;
import POJOClass.spouse;

public class EmployeeSerializationWithObject {
	
	@Test
	public void emplSeriWithObje() throws Throwable{
		
		int[] ph= {1234,5778};
		
		spouse sp=new spouse("sho", ph);
		
		EmployeeWithObject emp=new EmployeeWithObject("sachin", sp);
		
		ObjectMapper omap=new ObjectMapper();
		
		omap.writeValue(new File("./emp2.json"), emp);
		
	}

}
