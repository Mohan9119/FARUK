package pack4;
class Employee
{
	//several members
}
class D extends Thread
{
	@Override
	public void run() 
	{
	}
}
class E implements Runnable
{
	@Override
	public void run() 
	{
	}
}

public class skeleton_class 
{
	public static void main(String[] args) {
		D d1 = new D();
		d1.start();
		
		D d2 = new D();
		d2.start();
		
		D d3 = new D();
		d3.start();
		
		E e1 = new E();
		Thread t1 = new Thread(e1);
		t1.start();
		
		Thread t2 = new Thread(e1);
		t2.start();
		
		Thread t3 = new Thread(e1);
		t3.start();
		
	}
}
/*

 IN CASE OF FIRST WAY  of creating thread A.

 A class can't extends to employee class.
 its sub class to thread

its sub class to runnable.
 B class can extends to employee class also, because it implements runnable
not threads.
it can became sub class to employee.but A can't.

first approach for 1 object we can create 1 thread.

second approach is a single pattern 1 object only
through 1 object getting multiple threads.
second way of approach is better way.
*/
