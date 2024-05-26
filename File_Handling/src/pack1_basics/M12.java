package pack1_basics;

import java.io.File;
import java.io.IOException;

public class M12 
{
	public static void main(String[] args)  {
		File f1 =new File("dir1");
		f1.mkdir();
		System.out.println("done");
	}
}
