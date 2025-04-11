/*
 * Class: CMSC203 
 * Instructor: Professor Khandan Monshi
 * Description: creates savings and checking accounts that add interest or charge a fee.
 * Due: 04/11/2025
 * Platform/compiler: Eclipse Java
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Jin Ha Neul
*/
public class CheckingAccount extends BankAccount {
	private static final double FEE = 0.15;
	
	public CheckingAccount(String name, double amount){
		super(name, amount);
		setAccountNumber(getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount) {
		return super.withdraw(amount+FEE);
	}
}
