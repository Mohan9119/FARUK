package pack2_streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class M1 
{
	public static void main(String[] args) {
	File f1 =new File("C:\\Users\\faruk\\Pictures\\425 copy.jpg");
	File f2 = new File("photo1.jpg");
	try(FileInputStream fin =new FileInputStream(f1);
	BufferedInputStream bin =new BufferedInputStream(fin);
	FileOutputStream fout =new  FileOutputStream(f2);
	BufferedOutputStream bout =new BufferedOutputStream(fout))
			{
				byte[] bytes =new byte[(int)f1.length()];
				bin.read(bytes);
				System.out.println("done");
			}
			catch(IOException ex)
				{
					ex.printStackTrace();
				}
	}
}
/*
f1 is a file path

for reading purpose


*/