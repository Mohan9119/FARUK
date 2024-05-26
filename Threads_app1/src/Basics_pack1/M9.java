package Basics_pack1;

public class M9 {
	public static void main(String[] args) 
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.isDaemon());
		System.out.println(t1.getClass());
		System.out.println(t1.MIN_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t1.NORM_PRIORITY);
		System.out.println(t1.MAX_PRIORITY);
		System.out.println(t1.getId());
		System.out.println(t1.getStackTrace());
		System.out.println(t1.getState());
		System.out.println(t1.getThreadGroup());
		System.out.println(t1.getUncaughtExceptionHandler());
		System.out.println(t1.getAllStackTraces());
		
		
	}
}

/*
t1 is main thread reference variable.this statement
execute by main thread.main thread reference 
is returning to t1.


*/