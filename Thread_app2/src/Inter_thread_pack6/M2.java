package Inter_thread_pack6;

class A1
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
	synchronized void test2()
	{
		System.out.println("test2 on "+this+" begin by "+Thread.currentThread().getName());
		notifyAll();//obj1.notifyAll();
		System.out.println("test2 on "+this+" end by "+Thread.currentThread().getName());
		
	}
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
		obj.test1();
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
		obj.test1();
	}
}
public class M2 {
	public static void main(String[] args) throws InterruptedException {
		A1 obj1=new A1();
		A1 obj2=new A1();
		
		Thread t1 =new Thread11(obj1);
		t1.start();
		
		Thread t2 =new Thread21(obj1	);
		t2.start();
		Thread.sleep(10000);
		System.out.println("main after 10sec sleep");
		obj1.test2();
	}

}
