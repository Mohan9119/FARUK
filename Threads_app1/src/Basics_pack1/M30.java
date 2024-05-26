package Basics_pack1;

class Y extends Thread
{
	Y()
	{
		start();
	}
	@Override
	public void run() {
		System.out.println("run begin");
		System.out.println("run end");
	}
}
public class M30 
{
	public static void main(String[] args) {
		System.out.println(1);
		Y obj =new Y();
		obj.start();
		System.out.println(2);
	}
}

/*
on any object start method don't call more that one time

if you call more that 1 



 */
