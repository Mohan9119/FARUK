package pack1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M3 
{
	public static void main(String[] args) throws IOException {
		
		FileWriter out =new FileWriter("test3.txt",true);
		out.write("Hello4444444444444");
		out.write("test");
		out.write("abc4444444444444");
		out.write("\n");
		out.write("xyz");
		out.write("hi");
		out.write("end44444444444444");
		out.flush();
		out.close();
		System.out.println("done");
	}
}
