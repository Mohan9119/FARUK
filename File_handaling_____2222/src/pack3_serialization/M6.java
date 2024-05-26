package pack3_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class B implements Serializable
{
	int i;
	transient int j;
	static int k;
	B(int i,int j,int k)
	{
		this.i=i;
		this.j=j;
		this.k=k;
	}
	@Override
	public String toString() {
		
		return "("+i+" , "+j+" , "+k+ ")";
	}
}

public class M6 
{
	public static void main(String[] args) throws Exception {
		B b1 = new B(10,20,40);
		FileOutputStream fout= new FileOutputStream("test.ser");
		ObjectOutputStream out =new ObjectOutputStream(fout);
		out.writeObject(b1);
		System.out.println("done");
		
		
		
	}
}
