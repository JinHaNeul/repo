
public class Smoothie extends Beverage{
	private boolean addProtein;
	private int numOfFruits;
	private static final double PROTEIN_COST = 1.5, FRUIT_COST = 0.5;
	
	public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein) {
		super(bevName, Type.SMOOTHIE, size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
	}
	
	public int getNumOfFruits() {
		return numOfFruits;
	}
	
	public boolean getAddProtein() {
		return addProtein;
	}
	
	@Override
	public String toString() {
		return getBevName() + ", " + getSize() + ", Protein Added: " + addProtein + ", Number of Fruits: " + numOfFruits + ", Price: $" + String.format("%.2f", calcPrice());
	}
	
	@Override
	public double calcPrice() {
		double newPrice = addSizePrice();
		if (addProtein) {
			newPrice += PROTEIN_COST;
		}
		newPrice += (FRUIT_COST * numOfFruits);
		return newPrice;
	}
	
	@Override
	public boolean equals(Object anotherBev) {
		Smoothie t = (Smoothie) anotherBev;
		boolean nameFlag = this.getBevName().equals(t.getBevName());
		boolean typeFlag = this.getType()==t.getType();
		boolean sizeFlag = this.getSize()==t.getSize();
		boolean numOfFruitsFlag = this.getNumOfFruits()==t.getNumOfFruits();
		boolean addProteinFlag = this.getAddProtein()==t.getAddProtein();
		return (nameFlag && typeFlag && sizeFlag && numOfFruitsFlag && addProteinFlag);
	}
}
