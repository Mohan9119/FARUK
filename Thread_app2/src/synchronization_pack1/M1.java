package synchronization_pack1;

class Shared
{
	synchronized void test1()
	{
		Thread t1 =Thread.currentThread();
		for (int i=1; i<=10; i++)
		{
			System.out.println("from test1 "+i+" by "+t1.getName());
		}
	}
	
	void test2()
	{
		Thread t1 =Thread.currentThread();
		for (int i=1; i<=10; i++)
		{
			System.out.println("from test2 "+i+" by "+t1.getName());
		}
	}
}
class Thread1 extends Thread
{
	Shared s1;
	Thread1(Shared s1)
	{
		this.s1=s1;
	}
	@Override
	public void run() {
		s1.test1();
		//s1.test2();
	}
}
class Thread2 extends Thread
{
	Shared s1;
	Thread2(Shared s1)
	{
		this.s1=s1;
	}
	@Override
	public void run() {
		s1.test1();
		//s1.test2();
	}
}
public class M1
{
	public static void main(String[] args) {
		Shared s1=new Shared();
		Shared s2=new Shared();
		Thread1 t1=new Thread1(s1);
		Thread2 t2=new Thread2(s1);
		
		t1.start();
		t2.start();
//		s1.test1();
		s1.test2();
		
		
		
	}
}
/*
which ever thread is getting object lock of s1 that 
thread is going to corresponding synchronized method.

t1 got object lock of s1 then t1 thread is going to 

if both are looking 2 object class simultaneously.

synchronize is object wise not method wise.




*/
