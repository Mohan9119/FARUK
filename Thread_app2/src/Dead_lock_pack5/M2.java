package Dead_lock_pack5;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;

class Shared1
{
	synchronized void test1(Shared1 obj)
	{
		Thread t1 =Thread.currentThread();
		System.out.println("test1 begin by 		"+t1.getName());
		Util2.sleep(100);
		obj.test2(this);
		System.out.println("test1 end by 		"+t1.getName());
	}
	
	synchronized void test2(Shared1 obj)
	{
		Thread t1 =Thread.currentThread();
		System.out.println("test2 begin by 		"+t1.getName());
		Util2.sleep(1000);
		obj.test1(this);
		System.out.println("test1 end by 		"+t1.getName());
	
	}
}
class Util2
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
class Thread3 extends Thread
{
	Shared1 s1,s2;
	Thread3(Shared1 s1,Shared1 s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	@Override
	public void run() {
		s1.test1(s2);
	}
}
class Thread4 extends Thread
{
	Shared1 s1,s2;
	Thread4(Shared1 s1,Shared1 s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	@Override
	public void run() {
		s2.test2(s1);
	}
}
public class M2
{
	public static void main(String[] args) {
		Shared1 s1=new Shared1();
		Shared1 s2=new Shared1();
		Thread3 t1=new Thread3(s1,s2);
		t1.start();
		Util2.sleep(100);
		Thread4 t2=new Thread4(s1,s2);
		t2.start();
	


		Util2.sleep(2000);
		
		ThreadMXBean tmx=ManagementFactory.getThreadMXBean();
		long[]ids=tmx.findDeadlockedThreads();
		
		if (ids !=null)
		{
			System.out.println("Threads are under dead lock");
			System.out.println("dead locked threads ids:  "+Arrays.toString(ids));
		}
		else
		{
			System.out.println("no threads are under dead lock");
		}
	}
}
/*
Both the child threads are under dead look
when 1st thread realeasing s1 object lock ,once test1 completely getting.
when 2nd thread realeasing s2 object lock ,once test2 completely getting.



*/
