package pack1;

public class M16 {

	public static void main(String[] args) {
		
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			int i=10/0;
			System.out.println(2);
		}
		catch(NullPointerException ex)
		{
			System.out.println("From catch: "+ex.getMessage());
		}
		System.out.println("main end");
	}

}

/**
 this catch is used for only nullpointer 
 but unfurthunatly getting arithmetic error.
 catch is there but that error is not compatble error.
 */
