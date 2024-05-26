package Lambda_pack6;

interface A33
{
	void test()
	{
		
	}
}
public class M4 
{
	public static void main(String[] args) {
		A33 a1=new A33()
				{
					public void test()
					{
						System.out.println("from test");
					}
				};
				a1.test();
				System.out.println("done");
	}
}


// where ever anonymous inner class is defined only
//one objest is only allowed,you can't creste more than one.

