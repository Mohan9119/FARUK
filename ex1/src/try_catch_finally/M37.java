package try_catch_finally;

public class M37 {
	public static void main(String[] args) {
		System.out.println(1);
		try
		{
			System.out.println(2);
			int i=10/0;
		}
		catch(ArithmeticException ex)
		{
			System.out.println(3);
			//System.exit(0);
		}
		finally
		{
			System.out.println(4);
		}
		System.out.println(5);
	}
}
