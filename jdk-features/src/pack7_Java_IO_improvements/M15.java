package pack7_Java_IO_improvements;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class M15 
{
	public static void main(String[] args) throws IOException
	{
		File f1 =new File("D:\\core-java-basics\\loops\\break-and-continue\\src\\A.java");
		File f2 =new File("D:\\Core-java-advanced\\eclipse\\Inner_classes\\src\\Lambda_pack6\\M1.java");
		//Stream<String> files= Files.lines(f1.toPath());
		Stream<String> files= Files.lines(f2.toPath());
		files.forEach(c1->System.out.println(c1));
		
	}
}
