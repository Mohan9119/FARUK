package throws_pack5;

public class M2 {

	public static void main(String[] args) {
	//	test();
		try
		{
			test();
		}
		catch( ClassNotFoundException ex)
		{
			
		}
}
           static void test()  throws ClassNotFoundException
{
	Class.forName("");
	}
}
