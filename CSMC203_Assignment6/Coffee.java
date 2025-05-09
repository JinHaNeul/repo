
public class Coffee extends Beverage{
	private boolean extraShot, extraSyrup;
	private static final double EXTRA_SHOT_COST = 0.5, EXTRA_SYRUP_COST = 0.5;
	
	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		super(bevName, Type.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}
	
	public boolean getExtraShot() {
		return extraShot;
	}
	
	public boolean getExtraSyrup() {
		return extraSyrup;
	}
	
	@Override
	public double calcPrice() {
		double newPrice = addSizePrice();
		if (extraShot) {
			newPrice += EXTRA_SHOT_COST;
		}
		if (extraSyrup) {
			newPrice += EXTRA_SYRUP_COST;
		}
		return newPrice;
	}
	
	@Override
	public String toString() {
		return getBevName() + ", " + getSize() + ", Extra Shot: " + extraShot + ", Extra Syrup: " + extraSyrup + ", Price: $" + String.format("%.2f", calcPrice());
	}
	
	@Override
	public boolean equals(Object anotherBev) {
		Coffee t = (Coffee) anotherBev;
		boolean nameFlag = this.getBevName().equals(t.getBevName());
		boolean typeFlag = this.getType()==t.getType();
		boolean sizeFlag = this.getSize()==t.getSize();
		boolean extraShotFlag = this.getExtraShot()==t.getExtraShot();
		boolean extraSyrupFlag = this.getExtraSyrup()==t.getExtraSyrup();
		return (nameFlag && typeFlag && sizeFlag && extraShotFlag && extraSyrupFlag);
	}
}
