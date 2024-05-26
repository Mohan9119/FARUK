package pack1_basics;

import java.io.File;
import java.io.IOException;

public class M15 
{
	public static void main(String[] args)  {
		File f1 =new File("hello1.txt");
		File f2 =new File("dir1");
		System.out.println("f1.isFile() : "+f1.isFile());
		System.out.println("f2.isFile() : "+f2.isFile());
		System.out.println("f1.isDirectory() : "+f1.isDirectory());
		System.out.println("f2.isDirectory() : "+f2.isDirectory());
		System.out.println("done");
	}
}
 