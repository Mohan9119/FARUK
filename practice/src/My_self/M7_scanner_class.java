package My_self;

import java.util.ArrayList;
import java.util.Scanner;

public class M7_scanner_class 
{
	public static void main(String[] args) {
		ArrayList L1=new ArrayList();
		Scanner sc =new Scanner(System.in);
		do 
		{
			System.out.println("enter an element");
			String s1=sc.next();
			if(!L1.contains(s1))
			{
				L1.add(s1);
			}
			System.out.println("you want to add one more (y/n)?");
		}
		while("y".equalsIgnoreCase(sc.next()));
		System.out.println(L1);
	}
}
