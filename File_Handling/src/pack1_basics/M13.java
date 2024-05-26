package pack1_basics;

import java.io.File;
import java.io.IOException;

public class M13 
{
	public static void main(String[] args)  {
		File f1 =new File("dir2");
		System.out.println("a : "+f1.exists());
		System.out.println("a : "+f1.mkdir());
		System.out.println("a : "+f1.exists());
		System.out.println("done");
	}
}
 