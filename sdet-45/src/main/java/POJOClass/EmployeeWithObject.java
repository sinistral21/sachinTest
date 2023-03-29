package POJOClass;

public class EmployeeWithObject {
	
	String name;
	spouse spouse;
	
	
	public EmployeeWithObject(String name, POJOClass.spouse spouse) {
		super();
		this.name = name;
		this.spouse = spouse;
	}
	
	public EmployeeWithObject() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public spouse getSpouse() {
		return spouse;
	}

	public void setSpouse(spouse spouse) {
		this.spouse = spouse;
	}
	
	
	

}
