package pack1_basics;

import java.io.File;

public class M5 
{
	public static void main(String[] args) throws Exception {
		File f1 =new File("hello5.txt");
		System.out.println("a : "+f1.exists());
		System.out.println("a : "+f1.createNewFile());
		System.out.println("a : "+f1.exists());
		System.out.println("done");
	}
}

