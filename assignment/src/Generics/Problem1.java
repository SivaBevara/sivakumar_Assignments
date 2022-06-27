package Generics;

import java.util.HashSet;

public class Problem1 extends employee{
	
    public Problem1(int id, String name, int salary, String dept) {
		super(id, name, salary, dept);
		
	}

	public static void main(String[] args) {
    	
        HashSet<employee> act= new HashSet();
        
        employee e1=new employee(1,"Vivek",30000,"Dev");
        employee e2=new employee(2,"Ram",20000,"Q/A");
        employee e3=new employee(3,"Aditya",30000,"Dev");
        employee e4=new employee(4,"Saurav",50000,"Manager");
        
        act.add(e1);
        act.add(e2);
        act.add(e3);
        act.add(e4);
      
        System.out.println(act);
     
    }
}