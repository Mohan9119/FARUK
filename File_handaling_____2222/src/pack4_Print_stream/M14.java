package pack4_Print_stream;

import java.io.PrintStream;

public class M14 
{
	public static void main(String[] args) throws Exception
	{
		PrintStream p1= new PrintStream("test9.ser");
		p1.println("done");
		p1.println("done");
		p1.println("done");
		p1.println("done");
		p1.println("done");
		System.out.println("end");
	}
}
