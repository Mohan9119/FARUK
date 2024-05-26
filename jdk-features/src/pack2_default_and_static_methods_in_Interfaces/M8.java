package pack2_default_and_static_methods_in_Interfaces;

interface G
{
	default void test() 
	{
		System.out.println("from G==>test");
	}
}
interface H 
{
	default  void test() 
	{
		System.out.println("from H==>test");
	}
}
class I implements G,H
{
	
}

public class M8 
{
	public static void main(String[] args) {
		
		System.out.println("done");
		
	}
}

// to different implentations are inherited to I.