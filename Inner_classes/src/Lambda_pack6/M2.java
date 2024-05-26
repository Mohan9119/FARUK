package Lambda_pack6;

interface A1
{
	void test();
}
public class M2 
{
	static class B implements A1
	{
		public void test()
		{
			System.out.println("from test");
		}
	}
	public static void main(String[] args) {
		B b1=new B();
		b1.test();
		System.out.println("done");
	}
}
