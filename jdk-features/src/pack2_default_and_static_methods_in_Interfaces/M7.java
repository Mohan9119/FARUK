package pack2_default_and_static_methods_in_Interfaces;

interface A1
{
	void test1();
	public static void test2() 
	{
		System.out.println("from A1.9test2");
	}
}
class B implements A1
{
	public  void test1() 
	{
		System.out.println("from B.test1");
	}
}
class C implements A1
{
	public  void test1() 
	{
		System.out.println("from C.test1");
	}
}
class D implements A1
{
	public  void test1() 
	{
		System.out.println("from D.test1");
	}
}
public class M7 
{
	public static void main(String[] args) {
		B b1 =new B();
		b1.test1();
		C c1 =new C();
		c1.test1();
		D d1 =new D();
		d1.test1();
		A1.test2();
		System.out.println("done");
		
	}
}
