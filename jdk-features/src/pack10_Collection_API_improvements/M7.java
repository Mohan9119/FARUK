package pack10_Collection_API_improvements;

import java.util.HashMap;
import java.util.Map;

public class M7 
{
	public static void main(String[] args) {
		Map<Integer, String> M=new HashMap<Integer, String>();
		M.put(10, "abc");
		M.put(9, "xyz");
		M.put(8, "hello");
		M.put(7, "hi");
		M.put(6, "test");
		System.out.println(M);
		M.compute(6, (k,v)->v.concat("test    "));
		System.out.println(M);
	}
}
//comput something vale of particular key.

