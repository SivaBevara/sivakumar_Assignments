package oops;

class savings_Account extends Bank {
	double bal;
	double fd;

	public savings_Account(double bal, double fd) {
		this.bal = bal;
		this.fd = fd;
	}

	public void disp() {
		System.out.println("Total money in saving:" + (bal + fd));
	}

	public double get() {
		return bal + fd;
	}
}