package Thread_pool_pack10;

import java.util.ArrayList;

class Util
{
	static void sleep(long millis)
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
class CommonTaskThread extends Thread
{
	@Override
	public void run()
	{
		while(true)
		{
			//wait
			synchronized (this)
			{
				try
				{
					wait();
				}
				catch(InterruptedException ex)
				{
					ex.printStackTrace();
				}
			}
			
			//common task it can be any
			for (int i = 1; i <= 10 ; i++)
			{
				System.out.println(i+" by "+getName());
				Util.sleep(1000);
			}
			
			//notify
			synchronized (this)
			{
				notify();
			}
		}
	}
}
class ThreadPoolManger
{
	private ArrayList<CommonTaskThread> pool = new ArrayList<CommonTaskThread>();
	
	public void init ()
	{
		CommonTaskThread ct=null;
		for(int i = 1 ; i <= 10 ; i++)
		{
			ct = new CommonTaskThread();
			ct.start();
			pool.add(ct);
		}
		
	}
	
	
	public CommonTaskThread checkOut()
	{
		CommonTaskThread ct=null;
		if(pool.size()>0)
		{
			ct=pool.remove(0);
		}
		else
		{
			ct=new CommonTaskThread();
			ct.start();
		}
		return ct;
	}
	
	public void checkIn(CommonTaskThread ct)
	{
		if (pool.size() < 10)
		{
			pool.add(ct);
		}
		else
		{
			ct=null;
		}
	}
	
	public void release()
	{
		CommonTaskThread ct=null;
		for(int i=0;i<pool.size();)
		{
			ct=pool.remove(0);
			ct=null;
		}
		pool=null;
	}
	
	}
	class customer1 extends Thread
	{
		private ThreadPoolManger tpm;
		customer1(ThreadPoolManger tpm)
		{
			this.tpm=tpm;
		}
		@Override
		public void run() 
		{
			while(true)
			{
				System.out.println("customer1 is trying to get thread from the pool");
				CommonTaskThread ct=tpm.checkOut();
				synchronized (ct)
				{
					ct.notify();
				}
				synchronized (ct)
				{
					try
					{
						ct.wait();
					}
					catch(InterruptedException ex)
					{
						ex.printStackTrace();
					}
				}
				System.out.println("customer1 sending used thread back to the pool");
				tpm.checkIn(ct);
				Util.sleep(10000);
			}
		}
	}
	class customer2 extends Thread
	{
		private ThreadPoolManger tpm;
		customer2(ThreadPoolManger tpm)
		{
			this.tpm=tpm;
		}
		@Override
		public void run() 
		{
			while(true)
			{
				System.out.println("customer2 is trying to get thread from the pool");
				CommonTaskThread ct=tpm.checkOut();
				synchronized (ct)
				{
					ct.notify();
				}
				synchronized (ct)
				{
					try
					{
						ct.wait();
					}
					catch(InterruptedException ex)
					{
						ex.printStackTrace();
					}
				}
				System.out.println("customer2 sending used thread back to the pool");
				tpm.checkIn(ct);
				Util.sleep(10000);
			}
		}
	}



public class M1
{
	public static void main(String[] args) {
		ThreadPoolManger tpm = new ThreadPoolManger();
		tpm.init();
		
		customer1 c1=new customer1(tpm);
		c1.start();
		
		customer2 c2=new customer2(tpm);
		c2.start();
		
		
		Util.sleep(1000*1000);
		
		c1.stop();
		c2.stop();
		Util.sleep(20000);
		tpm.release();
		System.out.println("end of the game");
		
		
	}
}

/*
for every itarartion of while loop there are 3 

*/