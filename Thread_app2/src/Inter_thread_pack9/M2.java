package Inter_thread_pack9;


class Thread11 extends Thread
{
	
	
	public void run() 
	{
		synchronized (this)
		{
			System.out.println("wait on "+this+" begin by "+Thread.currentThread().getName());
			try
			{
				this.wait();//t1.wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("wait on "+this+" end by "+Thread.currentThread().getName());
		}
	}
}
class Thread21 extends Thread
{
	
	@Override
	public void run() 
	{
		synchronized (this)
		{
			System.out.println("wait on "+this+" begin by "+Thread.currentThread().getName());
			try
			{
				this.wait();//t2.wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("wait on "+this+" end by "+Thread.currentThread().getName());
		}
	}
}
public class M2 {
	public static void main(String[] args) throws InterruptedException {
			
		Thread t1 =new Thread11();
		t1.start();
		
		Thread t2 =new Thread21();
		t2.start();
		Thread.sleep(10000);
		System.out.println("main after 10sec sleep");
		
		
		synchronized (t1)
		{
			System.out.println("test2 on "+t1+" begin by "+Thread.currentThread().getName());
			t1.notifyAll();//t1.notifyAll();
			System.out.println("test2 on "+t1+" end by "+Thread.currentThread().getName());
			
		}
		synchronized  (t2)
		{
			System.out.println("test2 on "+t2+" begin by "+Thread.currentThread().getName());
			t2.notify();//t2.notify();
			System.out.println("test2 on "+t2+" end by "  +Thread.currentThread().getName());
			
		}
	}

}
