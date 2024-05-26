package pack1_basics;

import java.io.File;
import java.io.IOException;

public class M18 
{
	public static void main(String[] args)  {
		File src =new File("D:\\java_softwares");
		File[] members =src.listFiles();
		for(File member : members)
		{
			System.out.println(member.getName()+" : "+(member.isFile() ? "file":"directory"));
		}
	}
}
 

