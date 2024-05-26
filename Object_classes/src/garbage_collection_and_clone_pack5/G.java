package garbage_collection_and_clone_pack5;

public class G implements Cloneable 
{
	int i;
	public static void main(String[] args) throws CloneNotSupportedException {
	G obj1 = new G();
	obj1.i=10;
	G obj2 = (G)obj1.clone();
	System.out.println("a : "+obj2.i);
	obj2.i=20;
	obj2.i=30;
	System.out.println("c : "+obj2.i);
		
	}
}

/*
G is a cloneable type

*/