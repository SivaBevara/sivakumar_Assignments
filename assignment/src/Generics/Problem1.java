package Generics;

import java.util.HashSet;

public class Problem1 extends employee{
	
    public Problem1(int id, String name, int salary, String dept) {
		super(id, name, salary, dept);
		
	}

	public static void main(String[] args) {
    	
        HashSet<employee> act= new HashSet();
        
        employee e1=new employee(1,"Chaitanya",30000,"Developer");
        employee e2=new employee(2,"Nithish",20000,"Analyst");
        employee e3=new employee(3,"Ram",30000,"Developer");
        employee e4=new employee(4,"Veera",50000,"Manager");
        
        act.add(e1);
        act.add(e2);
        act.add(e3);
        act.add(e4);
      
        System.out.println(act);
     
    }
}