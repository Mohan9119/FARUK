package pack1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//how to read?

public class M6 
{
	public static void main(String[] args) throws IOException  {
		File f1 =new File("test3.txt");
		char[] chars = new char[10];
		FileReader fin =new FileReader(f1);
		fin.read(chars);
		fin.close();
		String s1=new String(chars);
		System.out.println(s1);
	}
}

/*
call read method by suppling empty array this empty array size is 50.
50 chars available in test3 that can be read.
then close.

FileReader fin =new FileReader(f1);
		fin.read(chars);
		fin.close();
Above 3 lines need try catch or throws.

in case of reading what ever file you supply that file should be available .

if you specify the characters then that much characters only readed.		
		
		

*/
