package pack4_Regular_expressions;

import java.text.SimpleDateFormat;
import java.util.Date;


public class M11 
{
	public static void main(String[] args) {
		 Date date =new Date();
		 System.out.println(date);
		// SimpleDateFormat sdf=new SimpleDateFormat("-----dd----mm---yy");
		 SimpleDateFormat sdf=new SimpleDateFormat("dd---mmm---yyyy");
		 String s1 =sdf.format(date);
		 System.out.println(s1);
		
	}
}
