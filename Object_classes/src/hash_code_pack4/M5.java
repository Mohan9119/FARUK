package hash_code_pack4;

public class M5 {
	public static void main(String[] args) {

		StringBuffer s1=new StringBuffer("hello");
		StringBuffer s2=new StringBuffer("hello");
		StringBuffer s3=new StringBuffer("hello");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	
	}
}
/*
inside a string buffer hashcode is not overridded.


*/