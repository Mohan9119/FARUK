package pack4_Print_stream;

import java.io.PrintStream;

public class M15 
{
	public static void main(String[] args) throws Exception
	{
		PrintStream p1= new PrintStream("test10.ser");
		PrintStream p2=System.out;
		p1.println(1);
		p2.println(2);
		System.out.println(3);
		System.setOut(p1);
		p1.println(4);
		p2.println(5);
		System.out.println(6);
		System.setOut(p2);
		p1.println(7);
		p2.println(8);
		System.out.println(9);
		System.out.println("end");
	}
}
/*
In the system class there is a set out method system class out 
is changing into p1 at line 14.


*/