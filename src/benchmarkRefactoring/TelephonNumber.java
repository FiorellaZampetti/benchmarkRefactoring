package benchmarkRefactoring;

public class TelephonNumber {

	public int officeAreaCode;
	public int officeNumber;
	
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
