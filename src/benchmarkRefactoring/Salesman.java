package benchmarkRefactoring;

public class Salesman extends Employee {

	public String name;
	public double annualCost;
	public Department department;
	public double rate;
	public boolean specialSkill;
	
	public double quota;
	
	public double getQuota(){
		return quota;
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
	
	public String getName(){
		return name;
	}
}
