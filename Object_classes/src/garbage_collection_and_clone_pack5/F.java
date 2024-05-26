package garbage_collection_and_clone_pack5;

public class F implements Cloneable
{
	public static void main(String[] args)throws CloneNotSupportedException {
		F f1 = new F();
		F f2 = (F)f1.clone();
		System.out.println("f1 : "+f1);
		System.out.println("f2 : "+f2);
	}
	
}
