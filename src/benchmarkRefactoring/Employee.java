package benchmarkRefactoring;

public class Employee implements Billable{
	
	public String name;
	public double annualCost;
	public Department department;
	public double rate;
	public boolean specialSkill;
	public Person _person;
	
	public int getOfficeAreaCode(){
		return _person.getOfficeAreaCode();
	}
	
	public Department getDepartment(){
		return department;
	}
	
	public double getRate(){
		return rate;
	}
	
	public boolean hasSpecialSkill(){
		return specialSkill;
	}
	public double getAnnualCost() {
		return annualCost;
	}

	public void setAnnualCost(double annualCost) {
		this.annualCost = annualCost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int id;
	
	public String getName(){
		return name;
	}

}
