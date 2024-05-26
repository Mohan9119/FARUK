package equals_pack3;

public class M8 {
	public static void main(String[] args) {
		String s1 ="hello";
		String s2 ="hello";
		String s3 =new String("hello");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
	}
}
/*
# it is checking the content no matter how string object 
 is created.
 # by using equals method it is comparing the content
 # object class equal method already overridded inside the string class
 
#it is comapring the content, if 2 string object content
is same ,it is returning a true.
 */