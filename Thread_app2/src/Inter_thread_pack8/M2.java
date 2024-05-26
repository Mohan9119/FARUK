package Inter_thread_pack8;

class A1
{
	
}
class Thread11 extends Thread
{
	A1 obj;
	Thread11(A1 obj)
	{
		this.obj=obj;
	}
	@Override
	public void run() 
	{
		synchronized (obj)
		{
			System.out.println("wait on "+obj+" begin by "+Thread.currentThread().getName());
			try
			{
				obj.wait();//obj1.wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("wait on "+obj+" end by "+Thread.currentThread().getName());
		}
	}
}
class Thread21 extends Thread
{
	A1 obj;
	Thread21(A1 obj)
	{
		this.obj=obj;
	}
	@Override
	public void run() 
	{
		synchronized (obj)
		{
			System.out.println("wait on "+obj+" begin by "+Thread.currentThread().getName());
			try
			{
				obj.wait();//obj1.wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("wait on "+obj+" end by "+Thread.currentThread().getName());
		}
	}
}
public class M2 {
	public static void main(String[] args) throws InterruptedException {
		A1 obj1=new A1();
		A1 obj2=new A1();
		
		Thread t1 =new Thread11(obj1);
		t1.start();
		
		Thread t2 =new Thread21(obj1);
		t2.start();
		Thread.sleep(10000);
		System.out.println("main after 10sec sleep");
		
		
		synchronized (obj1)
		{
			System.out.println("test2 on "+obj1+" begin by "+Thread.currentThread().getName());
			obj1.notifyAll();//obj2.notifyAll();
			System.out.println("test2 on "+obj1+" end by "+Thread.currentThread().getName());
			
		}
	}

}
