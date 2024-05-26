package pack1;

public class M28 {

	public static void main(String[] args) {
		int[] x=new int[10];
		int[] y=new int[20];
		x=y;
		y=x;
		System.out.println("done");
	}

}
