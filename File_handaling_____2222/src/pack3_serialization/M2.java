package pack3_serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable
{
	int i;
	A(int i)
	{
		this.i=i;
	}
	@Override
	public String toString() {
		
		return "i = "+i;
	}
}
public class M2 
{
	public static void main(String[] args) throws Exception {
		A a1=new A(90);
		FileOutputStream fout =new FileOutputStream("test2.ser");
		ObjectOutput out =new ObjectOutputStream(fout);
		out.writeObject(a1);
		System.out.println("done");
	}
}
