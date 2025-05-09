import java.util.ArrayList;

public class BevShop implements BevShopInterface {
	private ArrayList<Order> orders;
	private int  numOfAlcoholDrink;
	private Order currentOrder;
	
	public BevShop() {
		orders = new ArrayList<>();
		numOfAlcoholDrink = 0;
	}

	@Override
	public boolean isValidTime(int time) {
		return (time >= 8 && time <= 23);
	}

	@Override
	public int getMaxNumOfFruits() {
		return MAX_FRUIT;
	}

	@Override
	public int getMinAgeForAlcohol() {
		return MIN_AGE_FOR_ALCOHOL;
	}

	@Override
	public boolean isMaxFruit(int numOfFruits) {
		return (numOfFruits > MAX_FRUIT);
	}

	@Override
	public int getMaxOrderForAlcohol() {
		return MAX_ORDER_FOR_ALCOHOL;
	}

	@Override
	public boolean isEligibleForMore() {
		return (numOfAlcoholDrink >= MAX_ORDER_FOR_ALCOHOL);
	}

	@Override
	public int getNumOfAlcoholDrink() {
		return numOfAlcoholDrink;
	}

	@Override
	public boolean isValidAge(int age) {
		return (age > MIN_AGE_FOR_ALCOHOL);
	}

	@Override
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		Customer c = new Customer(customerName, customerAge);
		currentOrder = new Order(time, day, c);
		orders.add(currentOrder);
		numOfAlcoholDrink = 0;
		
	}

	@Override
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		currentOrder.addNewBeverage(bevName, size, extraShot, extraSyrup);
		
	}

	@Override
	public void processAlcoholOrder(String bevName, Size size) {
		if (!isEligibleForMore()) {
			currentOrder.addNewBeverage(bevName, size);
			numOfAlcoholDrink++;
		}
	}

	@Override
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		currentOrder.addNewBeverage(bevName, size, numOfFruits, addProtein);
		
	}

	@Override
	public int findOrder(int orderNo) {
		for (int i = 0; i < orders.size(); i++) {
			if (orders.get(i).getOrderNo()==orderNo) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		int index = findOrder(orderNo);
		if (index != -1) {
			return orders.get(index).calcOrderTotal();
		}
		return 0.0;
	}

	@Override
	public double totalMonthlySale() {
		double totalSale = 0.0;
		for (Order o: orders) {
			totalSale += o.calcOrderTotal();
		}
		return totalSale;
	}

	@Override
	public int totalNumOfMonthlyOrders() {
		return orders.size();
	}

	@Override
	public Order getCurrentOrder() {
		return currentOrder;
	}

	@Override
	public Order getOrderAtIndex(int index) {
		if (index >= 0 && index < orders.size()) {
			return orders.get(index);
		}
		return null;
	}

	@Override
	public void sortOrders() {
		int n = orders.size();
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (orders.get(j).compareTo(orders.get(min_idx)) < 0) {
                    min_idx = j;
                }
            }
            Order temp = orders.get(min_idx);
            orders.set(min_idx, orders.get(i));
            orders.set(i, temp);
        }
	}
	
	@Override
	public String toString() {
		return "toString BevShop";
	}
	
}
