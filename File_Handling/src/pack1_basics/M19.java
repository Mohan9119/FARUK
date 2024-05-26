package pack1_basics;

import java.io.File;
import java.io.IOException;

public class M19 
{
	public static void main(String[] args)  {
		File src =new File("D:\\java_softwares");
		File[] members =src.listFiles();
		int dirCount= 0, fileCount =0;
		for(File member : members)
		{
			if (member.isFile())
			{
				fileCount ++;
			}
			else
			{
				dirCount++;
			}
		}
		System.out.println("files count : "+fileCount);
		System.out.println("dir count : "+dirCount);
	}
}
 

