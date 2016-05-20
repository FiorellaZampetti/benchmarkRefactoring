package benchmarkRefactoring;

public class JobItem {

	double totalPrice;
	double unitPrice;
	Employee employee;
	int _low;
	int _high;
	
	boolean includes (int arg){
		return arg >= _low && arg<=_high;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	
}
