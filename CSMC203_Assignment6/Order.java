import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order>{
	private int orderNo;
	private int orderTime;
	private Day orderDay;
	private Customer cust;
	private ArrayList<Beverage> beverages;
	private static final int MIN_ORDER_NO = 10000, MAX_ORDER_NO = 90000;
	
	public Order(int orderTime, Day orderDay, Customer cust) {
		this.orderTime = orderTime;
        this.orderDay = orderDay;
        this.cust = new Customer(cust);
        this.orderNo = generateOrder();
        this.beverages = new ArrayList<>();
	}
	
	public int generateOrder() {
		Random r= new Random();
		return r.nextInt(MAX_ORDER_NO - MIN_ORDER_NO + 1) + MIN_ORDER_NO;
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	
	public int getOrderTime() {
		return orderTime;
	}
	
	public Day getOrderDay() {
		return orderDay;
	}
	
	public Customer getCustomer() {
		return new Customer(cust);
	}
	
	public boolean isWeekend() {
		return orderDay == Day.SATURDAY || orderDay == Day.SUNDAY;
	}
	
	public Beverage getBeverage(int itemNo) {
		if (itemNo >= 0 && itemNo < beverages.size()) {
			return beverages.get(itemNo);
		}
		return null;
	}
	
	public int getTotalItems() {
		return beverages.size();
	}
	
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		Coffee c = new Coffee(bevName, size, extraShot, extraSyrup);
		beverages.add(c);
	}
	
	public void addNewBeverage(String bevName, Size size) {
		Alcohol a = new Alcohol(bevName, size, isWeekend());
		beverages.add(a);
	}
	
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
		Smoothie s = new Smoothie(bevName, size, numOfFruits, addProtein);
		beverages.add(s);
	}
	
	public double calcOrderTotal() {
		double total = 0.0;
		for (Beverage b: beverages) {
			total += b.calcPrice();
		}
		return total;
	}
	
	public int findNumOfBeveType(Type type) {
		int count = 0;
		for (Beverage b: beverages) {
			if (b.getType() == type) {
				count ++;
			}
		}
		return count;
	}
	
	@Override
	public String toString() {
		return "toString Order";
	}
	
	@Override
	public int compareTo(Order anotherOrder) {
		return Integer.compare(this.orderNo, anotherOrder.orderNo);
	}
}
