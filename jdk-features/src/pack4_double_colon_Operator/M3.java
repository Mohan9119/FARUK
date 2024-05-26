package pack4_double_colon_Operator;


public class M3 
{
	static void m1()
	{
		System.out.println("from m1");
	}
	public static void main(String[] args) {
		A a1 =M3 :: m1 ;
		a1.test1();
	}
}


//test1 of a assigning to m1 definition.
// m1 is a static i.e why we are using class name.
//M3 :: m1 something like m1 method referring to test1 method a interface.
//:: mainly used for assigning 1 existing method to unimplemented method of an interface.
