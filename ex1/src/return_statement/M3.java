package return_statement;

public class M3 {
	int test1()
	{
		try 
		{
			//some statements
		}
		catch(ArithmeticException es)
		{
			//some statements
		}
		catch(NullPointerException es)
		{
			//some statements
		}
		return 10;
	}
	int test2()
	{
		try 
		{
			//some statements
			return 10;
		}
		catch(ArithmeticException es)
		{
			//some statements
		}
		catch(NullPointerException es)
		{
			//some statements
		}
		return 20;
	}int test3()
	{
		try 
		{
			//some statements
		}
		catch(ArithmeticException es)
		{
			//some statements
			return 10;
		}
		catch(NullPointerException es)
		{
			//some statements
		}
		return 20;
	}
	int test4()
	{
		try 
		{
			//some statements
		}
		catch(ArithmeticException es)
		{
			//some statements
			return 5;
		}
		catch(NullPointerException es)
		{
			//some statements
			return 10;
		}
		return 20;
	}
	int test5()
	{
		try 
		{
			//some statements
		}
		catch(ArithmeticException es)
		{
			//some statements
		}
		catch(NullPointerException es)
		{
			//some statements
			return 10;
		}
		return 20;
	}
//	int test6()
//	{
//		try 
//		{
//			//some statements
//			return 100;
//		}
//		catch(ArithmeticException es)
//		{
//			//some statements
//			return 25;
//		}
//		catch(NullPointerException es)
//		{
//			//some statements
//			return 10;
//		}
//		return 20;
//	}
}
