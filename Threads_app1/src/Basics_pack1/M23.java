package Basics_pack1;

public class M23 
{
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(2000,500);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("main end");
	}
}
