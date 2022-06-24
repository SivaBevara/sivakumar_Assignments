package assignment;

import java.util.Scanner;


public class Problem7{


	public static void main(String[] args) {
		
		int[] arr= {5,10,15,20,25,30,35,40,45,50};
		boolean found=false;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Number");
		int num=sc.nextInt();
		
		for(int i:arr)
		{
			if(i==num){
				found=true;
				break;
			}
		}
		
		if(found)	
			{
				System.out.println("Your number in array:");
			}
			else {
				System.out.println("number not in array");
			}
		}
		
	}