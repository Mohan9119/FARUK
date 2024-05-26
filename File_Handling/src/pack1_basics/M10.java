package pack1_basics;

import java.io.File;
import java.io.IOException;

public class M10 
{
	public static void main(String[] args)  {
		File dir =new File("D://Core-java-advanced");
		File f1 =new File(dir,"hello10.txt");
		System.out.println("a : "+f1.exists());
		try
		{
		System.out.println("b : "+f1.createNewFile());
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("c : "+f1.exists());
		System.out.println("done");
	}
}
