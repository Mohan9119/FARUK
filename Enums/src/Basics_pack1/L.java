package Basics_pack1;

enum K
{
	t1,t2,t3,t4;
}
public class L {
	public static void main(String[] args) {
		K k1 =K.t3;
		System.out.println(k1);
		k1=K.t1;
		System.out.println(k1);
//		k1=K.t5;
		System.out.println(k1);
	}
}
// here t5 constant is not available in enum so getting error.