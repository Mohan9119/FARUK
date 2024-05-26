package pack3_serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class H implements Serializable
{
	int x;
	double y;
	String z;
	H(int x, double y,	String z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	@Override
	public String toString() {
		
		return "("+x+" , "+y+" , "+z+")";
	}
	private void writeObject(ObjectOutputStream out)throws IOException
	{
		System.out.println("i am feom writeObject");
		out.defaultWriteObject();
		out.write(5000);
	}
	private void readObject(ObjectInputStream in)throws  Exception
	{
		System.out.println("i am feom readObject");
		in.defaultReadObject();
		int data =in.read();
		System.out.println(data);
	}
}
