package pack1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//how to read?

public class M9 
{
	public static void main(String[] args) throws IOException   {
		FileWriter out =new FileWriter("test9.txt",true);
		BufferedWriter bout =new BufferedWriter(out);
		bout.write("test");
		bout.write("test");
		bout.newLine();
		bout.write("test");
		bout.write("test");
		bout.newLine();
		bout.write("test");
		bout.write("test");
		bout.newLine();
		bout.write("test");
		bout.write("test");
		bout.flush();
		bout.close();
		System.out.println("done");
	}
}

/*

		

*/
