package pack1_basics;

import java.io.File;
import java.io.IOException;

public class M17 
{
	public static void main(String[] args)  {
		File f1 =new File("D:\\java_softwares");
		File[] members =f1.listFiles();
		for(File file : members)
		{
			System.out.println(file.getName());
		}
	}
}
 

//File f1 =new File("D:\\java_softwares");
// reading every member inside that directory

//File[] members =f1.listFiles();