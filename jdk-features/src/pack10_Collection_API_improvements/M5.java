package pack10_Collection_API_improvements;

import java.util.HashMap;
import java.util.Map;

public class M5 
{
	public static void main(String[] args) {
		Map<Integer, String> M=new HashMap<Integer, String>();
		M.put(10, "abc");
		M.put(9, "xyz");
		M.put(8, "hello");
		M.put(7, "hi");
		M.put(6, "test");
		System.out.println(M);
		System.out.println("M.get(9) : "+M.get(9));
		System.out.println("M.get(19) : "+M.get(19));
		System.out.println("M.getOrDefault(19) : "+M.getOrDefault(19,"some default"));
	}
}


