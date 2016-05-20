package benchmarkRefactoring;

public class PriceCalculator {
	
	
	public double getPrimaryBasePrice() {
		return primaryBasePrice;
	}
	public void setPrimaryBasePrice(double primaryBasePrice) {
		this.primaryBasePrice = primaryBasePrice;
	}
	public double getSecondaryBasePrice() {
		return secondaryBasePrice;
	}
	public void setSecondaryBasePrice(double secondaryBasePrice) {
		this.secondaryBasePrice = secondaryBasePrice;
	}
	public double getTertiaryBasePrice() {
		return tertiaryBasePrice;
	}
	public void setTertiaryBasePrice(double tertiaryBasePrice) {
		this.tertiaryBasePrice = tertiaryBasePrice;
	}
	
	double primaryBasePrice=10;
	double secondaryBasePrice=20;
	double tertiaryBasePrice=30;
	
	public double compute(){
		return  primaryBasePrice+(secondaryBasePrice*tertiaryBasePrice);
	}
}
