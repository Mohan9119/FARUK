package return_statement;

public class M2 {
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
		return 10;
	}
	int test2()
	{
		try 
		{
			//some statements
			return 20;
		}
		catch(ArithmeticException es)
		{
			//some statements
		}
		return 10;
	}
	int test3()
	{
		try 
		{
			//some statements
		}
		catch(ArithmeticException es)
		{
			//some statements
			return 20;
		}
		return 10;
	}
	int test4()
	{
		try 
		{
			//some statements
			return 10;
		}
		catch(ArithmeticException es)
		{
			//some statements
			return 20;
		}
	}
//	int test5()
//	{
//		try 
//		{
//			//some statements
//			return 10;
//		}
//		catch(ArithmeticException es)
//		{
//			//some statements
//		}
//	}
//	int test6()
//	{
//		try 
//		{
//			//some statements
//		}
//		catch(ArithmeticException es)
//		{
//			//some statements
//			return 20;
//		}
//	}
//	int test7()
//	{
//		try 
//		{
//			//some statements
//			return 5;
//		}
//		catch(ArithmeticException es)
//		{
//			//some statements
//			return 10;
//		}
//		return 20;
//	}
}
