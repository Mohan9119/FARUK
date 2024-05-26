package pack3_Functional_Interfaces_and_Lambda_Expressions;

interface A
{
	void test();
}
class B implements A
{
	public void test()
	{
		System.out.println("from test");
	}
}
public class M1 
{
	public static void main(String[] args) {
		B b1= new B();
		b1.test();
		System.out.println("-----------");
		B b2 =new B();
		b2.test();
		System.out.println("done");
	}
}
