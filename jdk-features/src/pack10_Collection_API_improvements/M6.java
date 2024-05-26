package pack10_Collection_API_improvements;

import java.util.HashMap;
import java.util.Map;

public class M6 
{
	public static void main(String[] args) {
		Map<Integer, String> M=new HashMap<Integer, String>();
		M.put(10, "abc");
		M.put(9, "xyz");
		M.put(8, "hello");
		M.put(7, "hi");
		M.put(6, "test");
		System.out.println(M);
		M.put(6, "new test");
		M.putIfAbsent(11, "new done");	
		System.out.println(M);
	}
}


