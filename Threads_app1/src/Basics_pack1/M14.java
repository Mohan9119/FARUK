package Basics_pack1;

class L extends Thread
{
	@Override
	public void run() {
		System.out.println("child thread");
	}
}
public class M14 {
	public static void main(String[] args) {
		L l1 =new L();
		Thread t1=new Thread(l1);
		t1.start();
		
		System.out.println(l1.getName());
		l1.setName("first child");
		System.out.println(l1.getName());
	}

}
