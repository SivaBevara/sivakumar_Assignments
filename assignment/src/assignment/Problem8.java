package assignment;


import java.util.Scanner;


public class Problem8 {


	public static void main(String[] args) {



		Scanner s=new Scanner(System.in);
		int[] arr= {5,10,65,20,13,76,35,98,45,50};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);

		}
	}


}