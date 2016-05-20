package benchmarkRefactoring;

import javax.xml.crypto.Data;

public class Owing {

	public String _name;
	public double outstanding;
	public int rating;
	public int _moreThanFiveLateDeliveries;
	public int invoiceableCreditLimit;
	
	public double getContact(){
		return rating*outstanding;
	}
	
	public int getInvoiceableCreditLimit(){
		return invoiceableCreditLimit;
	} 
	
	public int getRating(){
		return (_moreThanFiveLateDeliveries>5) ? 2:1;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getName() {
		 return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public double getOutstanding() {
		return outstanding;
	}

	public void setOutstanding(double outstanding) {
		this.outstanding = outstanding;
	}

	public void printOwing(){
		printBanner();
		
		//print details
		System.out.println("name: "+ _name);
		System.out.println("amount "+getOutstanding());
	}

	private void printBanner() {
		System.out.println("print banner method");
		
	}
}
