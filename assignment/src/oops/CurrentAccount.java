package oops;

class current_Account extends Bank {
	double bal;
	double cc;

	public current_Account(double bal, double cc) {
		this.bal = bal;
		this.cc = cc;
	}

	public void disp() {
		System.out.println("Total money in current: " + (bal + cc));
	}

	public double get() {
		return bal + cc;
	}
}
