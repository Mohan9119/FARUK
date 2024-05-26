package Basics_pack1;

class H extends Thread
{
	@Override
	public void run() {
		for(int i=1; i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}
public class M7 {
	public static void main(String[] args) {
		H h1 =new H();
		Thread t1=new Thread(h1);
		//t1.start();
		t1.run();
		//h1.run();
		
		for(int i=20; i<=30;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
		
	}

}

//in order to get current no of thread go for getname() .

//which ever thread excuting current thread method from that thread referance
//returning from that referance 

//where ever you wanted you can retrive referance of current excute thread.

//both threads are using different copies of same run method.
//even though run method is same using i copy of run method of e1 is differnt for e1 thread
//and another copy of e2 thread.

