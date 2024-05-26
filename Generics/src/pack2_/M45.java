package pack2_;

import java.util.HashMap;

public class M45 
{
	public static void main(String[] args) {
		HashMap<String, Integer> M = new HashMap<String, Integer>();
		M.put("hello", 22);
		M.put("abc", 12);
		M.put("xyz", 42);
		System.out.println(M);
		int i=M.get("abc");
		System.out.println(i);
	}

}
