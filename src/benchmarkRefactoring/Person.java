package benchmarkRefactoring;

public class Person {

	public String name;
	public int officeAreaCode;
	public int officeNumber;
	public int id;
	
	public boolean participate(Project p){
		for(int i=0;i<p.participants.length; i++){
			if(p.participants[i].id==id) return (true);
		}
		return false;
	}
	
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
