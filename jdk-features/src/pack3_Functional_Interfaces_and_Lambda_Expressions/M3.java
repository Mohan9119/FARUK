package pack3_Functional_Interfaces_and_Lambda_Expressions;

interface E
{
	void test();
}

public class M3 
{
	public static void main(String[] args) 
	{
		class F implements E
		{
			public void test()
			{
				System.out.println("from test");
			}
		}
		
		
		F f1= new F();
		f1.test();
		System.out.println("-----------");
		F f2 =new F();
		f2.test();
		System.out.println("done");
	}
}
