package Basics_pack1;

public class M11 {
	public static void main(String[] args) 
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1.getName());
		t1.setName("new name to main");
		System.out.println(t1.getName());
	
}
}
