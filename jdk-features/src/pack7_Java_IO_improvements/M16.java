package pack7_Java_IO_improvements;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class M16 
{
	public static void main(String[] args) throws IOException
	{
		//File f1 =new File("D:\\Core-java-advanced\\eclipse\\jdk-features\\src\\pack6_Java_Streams_creation_and_usage");
		File f1 =new File(".");
		Stream<Path> files= Files.walk(f1.toPath());
		files.forEach(c1->System.out.println(c1.getFileName()));
		
	}
}
