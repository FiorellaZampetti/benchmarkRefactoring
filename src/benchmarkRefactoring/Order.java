package benchmarkRefactoring;

public class Order {

	public double price(){
		double primaryBasePrice=10;
		double secondaryBasePrice=20;
		double tertiaryBasePrice=30;
		
		return primaryBasePrice+(secondaryBasePrice*tertiaryBasePrice);
	}
}
