package Basics_pack1;

class R extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=10;i++)
		{
			System.out.println(i);
		}
		
	}
}
public class M19 {
	public static void main(String[] args) {
		R r1 =new R();
		r1.setDaemon(true);
		r1.start();
		System.out.println("done ");
	}
}
/*
child is a user thread user not depending on parent.
no matter whether the parent is under execution or left from it.


*/