package ass4;

public class Problem1 {
	public String firstName;
	public String lastName;
	public int zipCode;
	
	Problem1(){
		
	}
	Problem1(String first, String last, int zip){
		firstName = first;
		lastName = last;
		zipCode = zip;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	public int getZipCode() {
		return zipCode;
	}
	
	public String Display() {
		return firstName + " " + lastName + " " + zipCode;
	}
	
}