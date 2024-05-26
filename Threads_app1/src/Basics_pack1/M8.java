package Basics_pack1;

class G extends Thread
{
	@Override
	public void run() {
		for(int i=1; i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}
public class M8 {
	public static void main(String[] args) {
		G g1 =new G();
		g1.start();
		//g1.run();
		
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

