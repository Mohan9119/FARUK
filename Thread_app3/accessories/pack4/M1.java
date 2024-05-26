package pack4;
class A extends Thread
{
	A (ThreadGroup tg, String name)
	{
		super(tg,name);
	}
	@Override
	public void run() 
	{
		for (int i=1;i<=1000;i++)
		{
			System.out.println(getName()+" : "+i);
		}
	}
}
class B extends Thread
{
	B (ThreadGroup tg, String name)
	{
		super(tg,name);
	}
	@Override
	public void run() 
	{
		for (int i=1;i<=1000;i++)
		{
			System.out.println(getName()+" : "+i);
		}
	}
}
class C implements Runnable
{
	
	@Override
	public void run() 
	{
		for (int i=1;i<=1000;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}
public class M1 {
	public static void main(String[] args) {
		ThreadGroup tg =new ThreadGroup("my first Group");
		A a1 = new A(tg,"first Thread");
		A a2 = new A(tg,"second Thread");
		
		B b1 = new B(tg,"third Thread");
		B b2 = new B(tg,"fourth Thread");
		
		C c1=new C();
		Thread t1 = new Thread(tg,c1,"5th Thread");
		Thread t2 = new Thread(tg,c1,"6th Thread");
		
		a1.start();
		a2.start();
		b1.start();
		b2.start();
		t1.start();
		t2.start();
		
		tg.stop();
	}

}
/*
before printing the output all threads are stopped.

multiple threads can be monitor through thread group.

there is no thread to start in tg so every thread start individually.

once all started those threads can monitor through methods of tg.

in c class we can't call getname() directly because it's not sub class to threads.


 


*/