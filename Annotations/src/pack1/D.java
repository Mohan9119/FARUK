package pack1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@interface D {
	String message();
}

//annotation is only used for description
//througth target we can specify to secifyic location to 
//specific purpose
