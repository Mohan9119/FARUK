package pack3_Functional_Interfaces_and_Lambda_Expressions;

interface C
{
	void test();
}

public class M2 
{
	static class D implements C
	{
		public void test()
		{
			System.out.println("from test");
		}
	}
	public static void main(String[] args) {
		D d1= new D();
		d1.test();
		System.out.println("-----------");
		D d2 =new D();
		d2.test();
		System.out.println("done");
	}
}
