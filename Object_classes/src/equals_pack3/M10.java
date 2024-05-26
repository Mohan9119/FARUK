package equals_pack3;

public class M10 {
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("hello");
		StringBuffer sb2=new StringBuffer("hello");
		System.out.println(sb1.equals(sb2));
	}
}
/*
even though 2 object content is same you will getting false
string buffer class containing object class equal is
asities.
it is comparing with the == operators b/w the differences.
*/