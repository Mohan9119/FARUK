package Basics_pack1;

class W extends Thread
{
	@Override
	public void run() {
		System.out.println("run begin");
		int i=10/0;
		
		System.out.println("run end");
	}
}
public class M28
{
	public static void main(String[] args) {
		System.out.println(1);
		W obj =new W();
		obj.start();
		System.out.println(2);
	}
}

// child thread is reciving un handled exception

