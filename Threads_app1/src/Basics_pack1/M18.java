package Basics_pack1;

class O extends Thread
{
	@Override
	public void run() {
		System.out.println("from O thread : "+getPriority());
	}
}

class P extends Thread
{
	@Override
	public void run() {
		System.out.println("from P thread : "+getPriority());
		setPriority(7);
		O th1=new O();
		th1.start();
	}
}

public class M18 
{
	public static void main(String[] args) {
		Thread.currentThread().setPriority(10);
		P p1=new P();
		p1.start();
	}
}


// main thread defalut value is 5 
//child thread priority is parent thread priority.
