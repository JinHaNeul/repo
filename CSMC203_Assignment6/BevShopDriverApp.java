import java.util.Scanner;

public class BevShopDriverApp {

	public static void main(String[] args) {
		BevShop shop = new BevShop();
		Scanner input = new Scanner(System.in);
		int count = 1;
		boolean continueFlag = true;
		System.out.print("What is the day?: ");
		Day day = Day.valueOf(input.nextLine().toUpperCase());
		System.out.print("What time is it?: ");
		int time = input.nextInt();
		if (!shop.isValidTime(time)) {
			System.out.println("Beverage Shop is closed.");
			continueFlag = false;
		}
		input.nextLine();
		while (continueFlag) {
			if (count > 1) {
				System.out.print("Would you please start a new order? (true/false): ");
				continueFlag = input.nextBoolean();
				input.nextLine();
				if (continueFlag == false) {
					break;
				}
			}
			
			System.out.println("The current order in process can have at most " + shop.getMaxOrderForAlcohol() + " alcoholic beverages.");
			System.out.println("The minimum age to order alcohol drink is " + shop.getMinAgeForAlcohol());		
			System.out.println("Start please a new order:");
			shop.startNewOrder(time, day, null, 0);
			System.out.println("Your Total Order for now is " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNo()));
			
			System.out.print("Would you please enter your name ");
			String name = input.nextLine();
			System.out.print("Would you please enter your age ");
			int age = input.nextInt();
			input.nextLine();
			shop.getCurrentOrder().getCustomer().setName(name);
			shop.getCurrentOrder().getCustomer().setAge(age);
			
			if (shop.isValidAge(age)) {
				System.out.println("Your age is above " + (shop.getMinAgeForAlcohol()-1) + " and you are eligible to order alcohol");
			} else {
				System.out.println("Your Age is not appropriate for alcohol drink!!");
			}
			
			while (!shop.isEligibleForMore() && shop.isValidAge(age)) {
				System.out.print("Would you please add an ALCOHOL to your order? (true/false): ");
				boolean alcoholFlag = input.nextBoolean();
				input.nextLine();
				if (!alcoholFlag) {
					break;
				}
				
				System.out.println("The current order of alcohol drinks is " + shop.getNumOfAlcoholDrink());
				System.out.print("Enter beverage name (e.g. Beer, Wine): ");
				String alcoholName = input.nextLine();
				System.out.print("Enter beverage size (SMALL, MEDIUM, LARGE): ");
				Size size = Size.valueOf(input.nextLine().toUpperCase());
				
				shop.processAlcoholOrder(alcoholName, size);
				
				System.out.println("The current order of drinks is " + shop.getCurrentOrder().getTotalItems());
				System.out.println("The Total price on the Order is " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNo()));
			}
			
			if (shop.isEligibleForMore()) {
				System.out.println("You have a maximum alcohol drinks for this order");
			}
			
			System.out.print("Would you please add a COFFEE to your order? (true/false): ");
			boolean coffeeFlag = input.nextBoolean();
			input.nextLine();
			if (coffeeFlag) {
				System.out.print("Enter beverage name (e.g. Espresso, Latte): ");
				String coffeeName = input.nextLine();
				System.out.print("Enter beverage size (SMALL, MEDIUM, LARGE): ");
				Size coffeeSize = Size.valueOf(input.nextLine().toUpperCase());
				System.out.print("Extra shot? (true/false): ");
				boolean extraShot = input.nextBoolean();
				System.out.print("Extra syrup? (true/false): ");
				boolean extraSyrup = input.nextBoolean();
				input.nextLine();
				
				shop.processCoffeeOrder(coffeeName, coffeeSize, extraShot, extraSyrup);
				System.out.println("Total items on your order is " + shop.getCurrentOrder().getTotalItems());
				System.out.println("The Total price on the Order: " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNo()));
			}
			
			System.out.print("Would you please add a SMOOTHIE to your order? (true/false): ");
			boolean smoothieFlag = input.nextBoolean();
			input.nextLine();
			if (smoothieFlag) {
				System.out.print("Enter beverage name (e.g. Strawberry, Banana): ");
				String smoothieName = input.nextLine();
				System.out.print("Enter beverage size (SMALL, MEDIUM, LARGE): ");
				Size smoothieSize = Size.valueOf(input.nextLine().toUpperCase());
				System.out.print("Num of fruits?: ");
				int numOfFruits = input.nextInt();
				System.out.print("Add protein? (true/false): ");
				boolean addProtein = input.nextBoolean();
				
				if (shop.isMaxFruit(numOfFruits)) {
					System.out.println("You reached a Maximum number of fruits for smoothies.");
					numOfFruits = shop.getMaxNumOfFruits();
				}
				shop.processSmoothieOrder(smoothieName, smoothieSize, numOfFruits, addProtein);
			}
			
			System.out.println("Total items on your order is " + shop.getCurrentOrder().getTotalItems());
			System.out.println("The Total price on the " + count + " Order: " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNo()));
			
			System.out.println("#----------------------------------------#");
			count++;
			
		}
		
		System.out.println("Total amount for all Orders: " + shop.totalMonthlySale());
		
		input.close();
	}

}
