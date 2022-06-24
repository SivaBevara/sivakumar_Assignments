package assignment;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {

		int num ;
		int originalNumber;
		int remainder;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");

		num = sc.nextInt();
		
		System.out.println(" Entered Number: " + num);

		originalNumber = num;
		int sum=0;

		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			sum = sum + remainder*remainder*remainder;
			//sum += Math.pow(remainder, 4);
			originalNumber /= 10;

		}
		if (sum == num)
			System.out.println(num + " is an Armstrong number.");
		else
			System.out.println(num + " is not an Armstrong number.");

	}

}