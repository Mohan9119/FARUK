package assert_pack1;
	import assert_pack1.pack11.M;
	import assert_pack2.N;
	import assert_pack2.pack22.O;
	public class L {
public static void main(String[] args) {
	System.out.println(1);
	assert false;
	System.out.println(2);
	assert_pack1.pack11.M.test2();
	System.out.println(3);
	assert_pack2.pack22.O.test4();
	System.out.println(4);
	assert_pack2.N.test3();
	System.out.println(5);
}
	
}
