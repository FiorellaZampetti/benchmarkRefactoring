package benchmarkRefactoring;

public class Person {

	public String name;
	public int officeAreaCode;
	public int officeNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOfficeAreaCode() {
		return officeAreaCode;
	}
	public void setOfficeAreaCode(int officeAreaCode) {
		this.officeAreaCode = officeAreaCode;
	}
	public void setTelephoneNumber(int officeNumber) {
		this.officeNumber = officeNumber;
	}
	
	public int getTelephoneNumber(){
		return officeNumber;
	}
}
