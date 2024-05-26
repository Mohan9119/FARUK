package Inter_thread_pack7;

class A
{
	synchronized void test1()
	{
		System.out.println("test1 on "+this+" begin by "+Thread.currentThread().getName());
		try
		{
			wait();//obj1.wait();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("test1 on "+this+" end by "+Thread.currentThread().getName());
	}
	
}
class Thread1 extends Thread
{
	A obj;
	Thread1(A obj)
	{
		this.obj=obj;
	}
	@Override
	public void run() 
	{
		obj.test1();
	}
}
class Thread2 extends Thread
{
	A obj;
	Thread2(A obj)
	{
		this.obj=obj;
	}
	@Override
	public void run() 
	{
		obj.test1();
	}
}
public class M1 {
	public static void main(String[] args) throws InterruptedException {
		A obj1=new A();
		A obj2=new A();
		
		Thread t1 =new Thread1(obj1);
		t1.start();
		
		Thread t2 =new Thread2(obj1	);
		t2.start();
		Thread.sleep(1000);
		System.out.println("main after 10sec sleep");
		
		
		synchronized  (obj2)
		{
			System.out.println("test2 on "+obj2+" begin by "+Thread.currentThread().getName());
			obj2.notify();//obj2.notify();
			System.out.println("test2 on "+obj2+" end by "  +Thread.currentThread().getName());
			
		}
	}

}
