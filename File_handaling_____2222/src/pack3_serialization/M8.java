package pack3_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class M8 
{
	public static void main(String[] args) throws Exception 
	{
		D d1 = new D(10,20);
		FileOutputStream fout = new FileOutputStream("test5.ser");
		ObjectOutputStream out =new ObjectOutputStream(fout);
		out.writeObject(d1);
		System.out.println("done");
		
		FileInputStream fin =new FileInputStream("test5.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		D d2= (D)in.readObject();
		System.out.println(d2);
		
		System.out.println(d1==d2);
	}
}

/*
here D is not implements to serialization but it will act as 
serializing because of its extends to C class which implements serialization



*/
