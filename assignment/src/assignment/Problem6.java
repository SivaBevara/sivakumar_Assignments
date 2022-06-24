package assignment;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username ");
		String username=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		if(username.equals("siva")&&password.equals("12345"))
		{
			System.out.println("Welcome "+username);
		}
		else
		{
			int count=0;
			for(int i=1;i<4;i++)
			{
				System.out.println("enter correct username ");
				username=sc.next();
				System.out.println("enter correct password");
				password=sc.next();
				if(username.equals("siva")&&password.equals("12345"))
				{
					System.out.println("Welcome "+username);
					break;
				}
				count++;
			}
			if(count==3)
				System.out.println("contact admin");
			
		}

	}

}
