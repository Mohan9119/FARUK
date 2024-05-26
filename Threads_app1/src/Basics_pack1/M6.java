package Basics_pack1;

class F implements Runnable {
	@Override
	public void run() {
		for(int i=1; i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
		
	}
}
public class M6 {
	public static void main(String[] args) {
		F f1 =new F();
		Thread t1=new Thread(f1);
		t1.start();
		
		Thread t2=new Thread(f1);
		t2.start();

		for(int i=50; i<=60;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
		
	}

}
/*
we cna create same object using f1 object

no need create f2 object for 2 thread 
for second thread also you can use same f1 

both the threads are rigesting with thread 
both are  


*/

