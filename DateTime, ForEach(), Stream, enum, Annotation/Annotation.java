// @FunctionalInterface                            //annotation.....functional interface...
// interface I1 {
//     void fun();
// }
// class Super {
//     void disp() {
//         System.out.println("Super method........");
//     }
// }
// class SubClass extends Super{
//     @Override                               //....annotation.....override...
//     void disp() {
//         System.out.println("Sub method--------------");
//     }
// }
// public class Annotation {
//     public static void main(String[] args) {
//         Super obj = new SubClass();
//         obj.disp();
//     }
// }





//.....Custom annotation.........

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface Hello {
    String str() default "paWAN";
    int val();
}

@Hello(val = 12)
class Demo {
    @Hello(val = 12)
    int a = 10;
    // @Hello                               //...error bcz " ElementType.METHOD " not present
    void fun() {
        System.out.println("Hello");
    }
}

public class Annotation {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.fun();
    }     
}