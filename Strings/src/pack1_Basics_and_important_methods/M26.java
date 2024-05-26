package pack1_Basics_and_important_methods;

public class M26 
{
	public static void main(String[] args) {
		String s1 = "xyz";
		System.out.println(s1);
		s1=s1.concat("hello");
		System.out.println(s1);
		
	}
}


// initial s1 points to xyz later s1 is reinitialize with return value of 
//s1.concat method. == xyz hello =s1