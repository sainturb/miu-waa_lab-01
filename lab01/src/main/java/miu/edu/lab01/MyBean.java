package miu.edu.lab01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.CONSTRUCTOR}) // for class
@Retention(RetentionPolicy.RUNTIME)
public @interface MyBean {
    String value() default "";
}
