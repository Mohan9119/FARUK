package checked_and_unchecked_pack4;

public class M2 {

	public static void main(String[] args) {
		//Class.forName("");
        
        try
        {
                Class.forName("");
        }
        catch(ClassNotFoundException ex)
        {
                ex.printStackTrace();
        }
	}

}
