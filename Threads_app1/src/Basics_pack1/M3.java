package Basics_pack1;

class A extends Thread
{
	@Override
	public void run() {
		for(int i=20 ; i<=30;i++)
		{
			System.out.println("second loop: "+i);
		}
	}
}
class B extends Thread
{
	@Override
	public void run() {
		for(int i=40 ; i<=50;i++)
		{
			System.out.println("third loop: "+i);
		}
	}
}
public class M3 
{
	public static void main(String[] args) {
		A a1=new A();
		a1.start();
		B b1=new B();
		b1.start();
		for(int i=1; i<=10;i++)
		{
			System.out.println("first loop: "+i);
		}
	}
}


