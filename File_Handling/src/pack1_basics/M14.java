package pack1_basics;

import java.io.File;
import java.io.IOException;

public class M14 
{
	public static void main(String[] args)  {
		File f1 =new File("D:\\Core-java-advanced\\dir2");
		System.out.println("a : "+f1.exists());
		System.out.println("a : "+f1.mkdir());
		System.out.println("a : "+f1.exists());
		System.out.println("done");
	}
}
 