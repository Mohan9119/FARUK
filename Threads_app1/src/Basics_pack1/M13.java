package Basics_pack1;

public class M13 {
	public static void main(String[] args) 
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1.getPriority());
		t1.setPriority(10);
		//t1.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		//t1.setPriority(Thread.NORM_PRIORITY);
		
		System.out.println(t1.getPriority());
	
}
}
