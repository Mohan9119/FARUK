package pack1;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface A12
{
	String message();
}
@Retention(RetentionPolicy.RUNTIME)
@interface B12
{
	String message();
}
@A12(message = "abc")
@B12(message = "xyz")
public class M13 
{
	public static void main(String[] args) throws ClassNotFoundException {
		Class c1=Class.forName("M13");
		Annotation[]annotations=c1.getAnnotations();
		for(Annotation annotation:annotations)
		{
			System.out.println(annotation);
		}
	}

}
