package Basics_pack1;

class V extends Thread
{
	@Override
	public void run() {
		System.out.println("run begin");
		util.sleep(10000);
		System.out.println("run end");
	}
}
public class M26 
{
	public static void main(String[] args) {
		System.out.println("main begin");
		V obj =new V();
		obj.start();
		util.sleep(2000);
		System.out.println("main end");
	}
}

// after 2 sec main is interrupted child.

// sleeping will be interrupted.when ever you are interrupting
//sleeping thread coming away from sleep with an exception.

//same is getting handled inside a util block.

//child thread suppose to sleep 10sec inside a main thread
//