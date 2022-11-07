package basic.inheritancetest;

import java.awt.*;
import java.lang.annotation.Inherited;

public class InheritanceTestDemo {
    public static void main(String[] args){
        new InheritanceTestDemo().test();
    }
    private void test(){
        System.out.println(new AChild().getClass().getAnnotation(UnInheritanceAnnotation.class));
        System.out.println(new BChild().getClass().getAnnotation(InheritanceAnnotation.class));
    }

    @UnInheritanceAnnotation
    public class A {}
    public class AChild extends A{}

    @InheritanceAnnotation
    public class B{}
    public class BChild extends B{}

}
