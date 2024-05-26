package Basics_pack1;

class N extends Thread
{
	@Override
	public void run() {
		System.out.println("child thread");
	}
}
public class M17 {
	public static void main(String[] args) {
		N n1 = new N();
		Thread t1=new Thread(n1,"my first thread");
		t1.start();
		n1.start();
		System.out.println(n1.getName());
		n1.setName("first child");
		System.out.println(n1.getName());
	}

}

/*
 in case of runnable which ever constructor we are using
 for the same 
 
 along with that name to the thread class.

*/