package pack1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//how to read?

public class M8 
{
	public static void main(String[] args)   {
		File f1 =new File("test3.txt");
		try (FileReader fin =new FileReader(f1))
		{
			char[] chars = new char[50];
			fin.read(chars);
			String s1=new String(chars);
			System.out.println(s1);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}

/*
wh
		

*/
