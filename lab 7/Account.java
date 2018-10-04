package lab7;

public class Account {
	private long accNum;
	private double balance;
	private String name;
	
	public Account( long accNum, double bal, String name) {
		this.accNum = accNum;
		this.balance = bal;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public double getBalance() {
		return this.balance;
	}
	public long getAccNumber() {
		return this.accNum;
	}
	
	public double depositAmt( double amt) {
		this.balance += amt;
		return this.balance;
	}
	
	public double withdrawAmt( double amt) {
		this.balance -= amt;
		return this.balance;
	}
	
	public String toString() {
		return "Account Number: " + this.accNum + " Name: " + this.name + " Balance: " + this.balance + "\n";
	}
}
