package POJOClass;

public class spouse {
	
	String spouse;
	int[] phone;
	
	
	public spouse(String spouse, int[] phone) {
		super();
		this.spouse = spouse;
		this.phone = phone;
	}
	
	public spouse() {
		
	}

	public String getSpouse() {
		return spouse;
	}

	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}

	public int[] getPhone() {
		return phone;
	}

	public void setPhone(int[] phone) {
		this.phone = phone;
	}
	
	

}
