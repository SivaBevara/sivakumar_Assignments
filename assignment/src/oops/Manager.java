package oops;

public class Manager extends Employee{

	public static final double INCENTIVE=2000;
	public Manager(int employeeId, String employeeName, double salary) {
		super(employeeId, employeeName, salary);
	}
	public double getSalary() {
		return salary+INCENTIVE;
	}
}