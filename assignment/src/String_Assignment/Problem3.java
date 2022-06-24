package String_Assignment;

public class Problem3{

	public static void main(String[] args) {

		 
		String s1="java string pool refers to the collection of strings which are stored in heap memory";
		String s2=s1.toUpperCase();
		System.out.println("Upper case : "+s2);
		
		
		String s3=s2.toLowerCase();
		System.out.println("Lowercase : "+s3);


		
		String replaceString=s1.replace('a','$');
		System.out.println("Replaced string : "+replaceString);

		
		if(s1.contains("collection"))
		{
			System.out.println( "found in string");
		}
		else{
			System.out.println("not found in string");
		}


		System.out.println(s1.matches("java string pool refers to the collection of strings which are stored in heap memory"));

	}

}
