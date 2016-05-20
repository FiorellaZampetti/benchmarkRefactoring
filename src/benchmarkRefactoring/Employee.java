package benchmarkRefactoring;

public class Employee {

	public double quota;
	public String name;
	public double annualCost;
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
	
	public double getQuota(){
		return quota;
	}
}
