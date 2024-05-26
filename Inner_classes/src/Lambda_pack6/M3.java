package Lambda_pack6;

interface A2
{
	void test();
}
public class M3 
{
	public static void main(String[] args) {
		class B implements A2
		{
			public void test()
			{
				System.out.println("from test ");
			}
		}
		B b1=new B();
		b1.test();
		b1.test();
		b1.test();
	}
}


// b visiblity is in main method .
//we can't use b in outside main method.

//