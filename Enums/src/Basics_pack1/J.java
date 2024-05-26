package Basics_pack1;

enum I
{
	test1,	test2,	test3
}
public class J {
	public static void main(String[] args) {
		I ref1=I.test3;
		System.out.println(ref1);
		
		ref1=I.test1;
		System.out.println(ref1);
	}
}

/*
ref is a data type of i then you can assign any of the 
 available data type.

same ref is reassigned with another constant of i.
*/