package Basics_pack1;

class U extends Thread
{
	@Override
	public void run() {
		System.out.println("run begin");
		for(int i=10;i<=21;i++)
		{
			System.out.println(i);
			util.sleep(5000);
		}
		System.out.println("run end");
	}
}
public class M25 
{
	public static void main(String[] args) 
	{
		U obj=new U();
		obj.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			util.sleep(2000);
		}
		System.out.println("main end");
	}
}

/*
 
 
 
 */
