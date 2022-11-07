package basic.inheritancetest;

import java.lang.annotation.*;

@Inherited
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface InheritanceAnnotation {
}
