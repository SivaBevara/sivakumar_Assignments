package collections;

import java.util.TreeSet;

class Problem3{

	public static void main(String[] args)
	{

		System.out.println("Sorting on the basis of name ascending order");

		TreeSet<Employee> Details = new TreeSet<>((Employee e1, Employee e2)-> (e1.name).compareTo(e2.name));

		Details.add(new Employee(1, "Raju" ,"RM" , 22000));
		Details.add(new Employee(2, "Somu" ,"BU" ,24000));
		Details.add(new Employee(3, "Damu" ,"LM" ,26000));
		Details.add(new Employee(4, "Ahmed" ,"AM" ,28000));


		for (Employee employee : Details) {
			System.out.println(employee);
		}

		
	}
}


