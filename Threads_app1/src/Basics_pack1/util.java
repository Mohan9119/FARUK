package Basics_pack1;

public class util {
	public static void sleep(long millis)
	{
		try 
		{
			Thread.sleep(millis);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}

}
