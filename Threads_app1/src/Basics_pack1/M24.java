package Basics_pack1;

class T extends Thread
{
	@Override
	public void run() {
		System.out.println("run begin");
		for(int i=11;i<=20;i++)
		{
			System.out.println(i);
			try 
			{
				sleep(5000,500);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		
	}
}
public class M24 
{
	public static void main(String[] args) 
	{
		T obj=new T();
		obj.start();
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

/*
 
 
 
 */
