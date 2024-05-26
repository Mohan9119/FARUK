package Basics_pack1;

class S extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=10;i++)
		{
			System.out.println(i);
		}
		
	}
}
public class M21 {
	public static void main(String[] args) {
		S s1 =new S();
		s1.start();
		try
		{
			s1.join();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done ");
	}
}
/*


*/