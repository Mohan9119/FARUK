package pack6_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CONMTOR 
{
	String Fname; 
	String Lname; 
	CONMTOR(String Fname,String Lname) 
	{ 
	 this.Fname=Fname; 
	 this.Lname=Lname; 
	} 
	public String toString() 
	{ 
	 return "CONMTOR{Fname= "+Fname+",Lname = "+Lname+"}"; 
	 
	} 
	class SBOFN implements Comparator
	{
		@Override
		public String compare(Object o1, Object o2) {
			return ((CONMTOR)o1).Fname-((CONMTOR)o2).Fname;
		}
	}
	class SBOLN implements Comparator
	{
		@Override
		public String compare(Object o1, Object o2) {
			return ((CONMTOR)o1).Lname-((CONMTOR)o2).Lname;
		}
	}
	public class M10 
	{
		public static void main(String[] args) {
			ArrayList L =new ArrayList();
			L.add(new CONMTOR("A","B"));
			L.add(new CONMTOR("D","C"));
			L.add(new CONMTOR("E", "F"));
			L.add(new CONMTOR("G","H"));
			System.out.println(L);
			Collections.sort(L,new SBOFN());
			System.out.println(L);
			Collections.sort(L,new SBOLN());
			System.out.println(L);
		}
	}
}
