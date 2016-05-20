package benchmarkRefactoring;

public class Order {

	public double price(){
		
		return new PriceCalculator().compute();
	}
}
