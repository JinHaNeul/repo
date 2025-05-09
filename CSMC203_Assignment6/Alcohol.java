
public class Alcohol extends Beverage{
	private boolean isWeekend;
	private static final double WEEKEND_COST = 0.6;
	
	public Alcohol(String bevName, Size size, boolean isWeekend) {
		super(bevName, Type.ALCOHOL, size);
		this.isWeekend = isWeekend;
	}
	
	public boolean isWeekend() {
		return isWeekend;
	}
	
	@Override
	public String toString() {
		return getBevName() + ", " + getSize() + ", Weekend: " + isWeekend + ", Price: $" + String.format("%.2f", calcPrice());
	}
	
	@Override
	public double calcPrice() {
		double newPrice = addSizePrice();
		if (isWeekend) {
			newPrice += WEEKEND_COST;
		}
		return newPrice;
	}
	
	@Override
	public boolean equals(Object anotherBev) {
		Alcohol t = (Alcohol) anotherBev;
		boolean nameFlag = this.getBevName().equals(t.getBevName());
		boolean typeFlag = this.getType()==t.getType();
		boolean sizeFlag = this.getSize()==t.getSize();
		boolean isWeekendFlag = this.isWeekend()==t.isWeekend();
		return (nameFlag && typeFlag && sizeFlag && isWeekendFlag);
	}
}
