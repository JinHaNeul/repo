/*
 * Class: CMSC203 
 * Instructor: Professor Khandan Monshi
 * Description: 
 * Due: 04/11/2025
 * Platform/compiler: Eclipse Java
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Jin Ha Neul
*/
public class SavingsAccount extends BankAccount {
	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount){
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount,amount);
		this.savingsNumber = oldAccount.savingsNumber + 1;
		this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
	}
	
	public void postInterest() {
		double interest = (getBalance() * (rate / 100)) / 12;
		deposit(interest);
	}
	
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
}
