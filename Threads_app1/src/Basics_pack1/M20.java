package Basics_pack1;

class Q extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=10;i++)
		{
			System.out.println(i);
		}
		
	}
}
public class M20 {
	public static void main(String[] args) {
		Q q1 =new Q();
		q1.start();
		System.out.println("done ");
	}
}
/*
child is a user thread user not depending on parent.
no matter whether the parent is under execution or left from it.


*/