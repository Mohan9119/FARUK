package pack3_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class M7 {
public static void main(String[] args) throws Exception {
	FileInputStream fin =new FileInputStream("test.ser");
	ObjectInputStream in = new ObjectInputStream(fin);
	B b1 = (B)in.readObject();
	System.out.println(b1);
	
}
}
