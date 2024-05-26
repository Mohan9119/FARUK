package throw_pack6;

import java.util.Scanner;

public class D {
public static void main(String[] args) 
{
	System.out.println(1);
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter age");
	int age= sc.nextInt();
	if(age <=0)
	{
		throw new AgeIsNegativeException("age should be greater than 0");
	}
	// continue
	System.out.println(2);
}
}
