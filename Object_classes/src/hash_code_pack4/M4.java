package hash_code_pack4;

public class M4 {
	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}

/*
# in side a string class already hashcode is overridded.
# based on the content its returning hashnumber.


*/