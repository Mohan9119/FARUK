package pack1_basics;

import java.io.File;
import java.io.IOException;

public class M6 
{
	public static void main(String[] args)  {
		File f1 =new File("hello6.txt");
		System.out.println("a : "+f1.exists());
		try
		{
		System.out.println("a : "+f1.createNewFile());
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("a : "+f1.exists());
		System.out.println("done");
	}
}

