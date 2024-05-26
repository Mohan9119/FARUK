package pack3_set;

import java.util.HashSet;

public class M5 
{
	public static void main(String[] args) {
		HashSet set = new HashSet();
		System.out.println(set.add("hello"));
		System.out.println(set.add("hello"));
		System.out.println(set.add("abc"));
		System.out.println(set.add("abc"));
		System.out.println(set.add("xyz"));
		System.out.println(set.add("xyz"));
		System.out.println(set);
	}
}

//similar to wrapper class even in string class also already hashcode
// and equals method got override.

// it is not allowing duplicates while adding to hashset.

// which ever order you are storing its not stored in that way.
//in case of set no index no key element is not assigning with index 
//or key element is jut store in the container.

// while storing it is checking only duplication.