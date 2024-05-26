package pack2_default_and_static_methods_in_Interfaces;

interface G1
{
	default void test() 
	{
		System.out.println("from G1==>test");
	}
}
interface H1 
{
	default  void test() 
	{
		System.out.println("from H1==>test");
	}
}
class I1 implements G1,H1
{
	public  void test() 
	{
		System.out.println("from I1==>test");
	}
	
}

public class M9 
{
	public static void main(String[] args) {
		I1 i1=new I1();
		i1.test();
		System.out.println("done");
		
	}
}

//