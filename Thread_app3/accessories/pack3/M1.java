package pack3;

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
class A extends Thread
{
	ThreadLocal t1;
	A(ThreadLocal t1)
	{
		this.t1 =t1;
	}
	@Override
	public void run() {
		System.out.println("a : "+t1.get());
		t1.set(10);
		Util.sleep(500);
		System.out.println("b : "+t1.get());
		t1.set(20);
		Util.sleep(500);
		System.out.println("c : "+t1.get());
		t1.set(30);
	}
}
class B extends Thread
{
	ThreadLocal t1;
	B(ThreadLocal t1)
	{
		this.t1 =t1;
	}
	@Override
	public void run() {
		System.out.println("d : "+t1.get());
		t1.set(40);
		Util.sleep(500);
		System.out.println("e : "+t1.get());
		t1.set(50);
		Util.sleep(500);
		System.out.println("f : "+t1.get());
		t1.set(60);
	}
}

public class M1 
{
	public static void main(String[] args)
	{
		
		ThreadLocal t1 =new ThreadLocal();
		t1.set(70);
		A a1=new A(t1);
		a1.start();
		Util.sleep(250);
	
		B b1=new B(t1);
		b1.start();
		Util.sleep(2000);
		System.out.println("g : "+t1.get());
	
	}
}

/*
ThreadLocal maintaining value local to a thread other threads are
not visible

here A thread is not visible to B thread and
here B thread is not visible to A thread

even thought same threadlocal is used for 3 threads 1 value is not
showing to another one.

if any thread calling get method without setting a value it will get null.





*/


