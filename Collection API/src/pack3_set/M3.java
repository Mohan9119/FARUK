package pack3_set;

import java.util.HashSet;

public class M3 
{
	public static void main(String[] args) {
		HashSet set = new HashSet();
		System.out.println(set.add(90));
		System.out.println(set.add(90));
		System.out.println(set.add(90));
		System.out.println(set.add(90));
		System.out.println(set.add(90));
		System.out.println(set.add(91));
		System.out.println(set);
	}
}

//trying to print return value of add method.
//similar to wrapper class 