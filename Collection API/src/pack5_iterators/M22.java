package pack5_iterators;

import java.util.Enumeration;
import java.util.Vector;

public class M22 
{
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(9000);
		v1.add(100);
		v1.add(789);
		v1.add(345);
		v1.add(0);
		Enumeration e1 =v1.elements();
		while (e1.hasMoreElements())
		{
			System.out.print(e1.nextElement()+", ");
		}
		System.out.println();
		System.out.println("-------------");
		System.out.println(v1);
	}
}
