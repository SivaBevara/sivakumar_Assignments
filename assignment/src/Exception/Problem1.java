package Exception;

import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        try{
        	
            System.out.printf("Enter numerator and denominator: ");
            int numerator=sc.nextInt();
            int denominator=sc.nextInt();
            int remainder= numerator/denominator;
            
            System.out.println("The quotient is "+remainder);

        }
        
        catch (ArithmeticException e)
        {
            System.out.printf("Can't divide by zero");
        }
        sc.close();
    }
}