package garbage_collection_and_clone_pack5;

public class E {
public static void main(String[] args) throws CloneNotSupportedException {
	E e1 = new E();
	System.out.println("1");
	E e2 = (E) e1.clone();
	System.out.println("done");
}
}
