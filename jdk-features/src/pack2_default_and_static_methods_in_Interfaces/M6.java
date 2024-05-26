package pack2_default_and_static_methods_in_Interfaces;

interface A
{
	public static void test() 
	{
		System.out.println("from test");
	}
}
public class M6 
{
	public static void main(String[] args) {
		A.test();
		System.out.println("---------");
		A.test();
		System.out.println("---------");
		A.test();
		System.out.println("---------");
	}
}
