package pack2_string_buffer;

public class M11 
{
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("test");
		System.out.println(sb);
		sb.delete(20,30);
		System.out.println(sb);
	}
}
/*
*string is mutable 
* string buffer immutable

*in side a string equals and hashcode override. 
*not override in stringbuffer 

*sting class implementing comparable interface 
*string buffer not implementing comparable interface.

*we create string object without new operator.
*we can't create string object without new operator.

*+ operator overloaded only with string.
*not with string buffer.

*in case of string for adding method we use concat.
*in case of string buffer for adding method we use append.

*inside a string class there is no reverse method.
*inside a string buffer class there is reverse method.





*/