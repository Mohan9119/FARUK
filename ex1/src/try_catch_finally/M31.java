package try_catch_finally;

import java.util.Scanner;

public class M31 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter some Thing :   ");
		String s1 =sc.next();
		try
		{
			System.out.println(1);
			int i=Integer.parseInt(s1);
			System.out.println(2);
			int k= i/(i-9);
			System.out.println(3);
		}
		catch(NumberFormatException ex)
		{
			System.out.println(4);
		}
		finally
		{
			System.out.println(5);
		}
		System.out.println(6);

	}

}
