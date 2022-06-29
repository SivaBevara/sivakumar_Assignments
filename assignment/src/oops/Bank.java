package oops;

public class Bank {
	public static void main(String[] args) {
		savings_Account s = new savings_Account(30000, 4000);
		
		current_Account c = new current_Account(500000, 20000);
		s.disp();
		c.disp();
		
		double totalAmount = s.get() + c.get();
		System.out.println("The total money in bank: " + totalAmount);
	}
}