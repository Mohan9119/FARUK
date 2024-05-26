package pack1;

public class M29 {

	public static void main(String[] args) {
		int[] x=new int[10];
		byte[] y=new byte[20];
		x=y;
		y=x;
		System.out.println("done");
	}

}


//even though byte data type while assigning one data type to another
//its not widening