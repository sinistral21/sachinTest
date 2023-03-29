package POJOClass;

public class Employee {
	
	//step1: declare the variables globally
	String name;
	int phno;
	int id;
	//step2:create constructor to initilize values
	public Employee(String name, int phno, int id) {
		super();
		this.name = name;
		this.phno = phno;
		this.id = id;
	}
	//step3:to trigger the execution for serialization and deserialization
	public Employee() {
		
	}
    //step4:provides getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
}
