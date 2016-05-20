package benchmarkRefactoring;

public class Owing {

	public String _name;
	public double outstanding;
	
	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
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
