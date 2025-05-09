
abstract class Beverage {
	private String bevName;
	private Type type;
	private Size size;
	private static final double BASE_PRICE = 2.0, SIZE_PRICE = 0.5;
	
	public Beverage(String bevName, Type type, Size size) {
		this.bevName = bevName;
		this.type = type;
		this.size = size;
	}
	
	abstract double calcPrice();
	
	public double getBasePrice() {
		return BASE_PRICE;
	}
	
	public Type getType() {
		return type;
	}
	
	public String getBevName() {
		return bevName;
	}
	
	public Size getSize() {
		return size;
	}
	
	public double addSizePrice() {
		double newPrice = BASE_PRICE;
		switch (this.size) {
		case SMALL:
			break;
		case MEDIUM:
			newPrice += SIZE_PRICE;
			break;
		case LARGE:
			newPrice += (SIZE_PRICE*2);
			break;
		}
		return newPrice;
	}
	
	@Override
	public String toString() {
		return "Name: " + bevName + ", Size: " + size;
	}
	
	@Override
	public boolean equals(Object anotherBev) {
		Beverage t = (Beverage) anotherBev;
		return (this.bevName.equals(t.getBevName()) && this.type==t.getType() && this.size==t.getSize());
	}
}
