package pack1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//how to read?

public class M7 
{
	public static void main(String[] args)   {
		File f1 =new File("test3.txt");
		char[] chars = new char[50];
		FileReader fin =null;
		try 
		{
			fin=new FileReader(f1);
			fin.read(chars);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if (fin !=null)
			{
				try
				{
					fin.close();
				}
				catch(IOException ex1)
				{
					ex1.printStackTrace();
				}
			}
		}
		String s1=new String(chars);
		System.out.println(s1);
	}
}

/*
	

*/
