package pack1;

import java.util.Scanner;

public class M25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some THing :  ");
		String s1 = sc.next();
		try
		{
			System.out.println(1);
			int i=Integer.parseInt(s1);
			System.out.println(2);
			int k= i/(i-9);
			System.out.println(3);
		}
		catch (ArithmeticException ex)
		{
			System.out.println(4);
		}
		System.out.println(5);
		
	}

}
/*
if try containing multiple abnormal condition then try to
provide multiple catches. 

*/
