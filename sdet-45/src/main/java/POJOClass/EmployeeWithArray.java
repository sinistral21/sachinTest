package POJOClass;

public class EmployeeWithArray {
	
	String name;
	int[]  phno;
	
	
	public EmployeeWithArray(String name, int[] phno) {
		super();
		this.name = name;
		this.phno = phno;
	}
	
	public EmployeeWithArray() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getPhno() {
		return phno;
	}

	public void setPhno(int[] phno) {
		this.phno = phno;
	}

	
}
