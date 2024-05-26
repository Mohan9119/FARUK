package Basics_pack1;

class X extends Thread
{
	 X()
	 {
		 start();
	 }
	 @Override
	public void run() {
		 System.out.println("run begin");
		 System.out.println("run end");
		}
}
public class M29 
{
	public static void main(String[] args) {
		System.out.println(1);
		X obj =new X();
		System.out.println(2);
	}
}

//while creating thread it self start method is calling
//you can considerd as auto starting'

//If thread is getting auto start. then you can't
//start main agian
