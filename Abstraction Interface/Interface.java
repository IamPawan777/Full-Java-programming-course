//.....just like class.....only define variable, declare method.....

// interface Demo {
//     int a=9;                //public, static, final (there is no abtract veriable)
//     void disp();                    //public, abstract
// }
// class Interface {
//     public static void main(String[] args) {
//         System.out.println(Demo.a);
//     }
// }




// //....all method which are declare in the interface ...define must in implemanted class also write "public"....
// interface Car{
//     int sits = 4;
//     float speed();
//     void color();
// }
//  class Toyata implements Car {
//     public float speed(){
//         return sits+sits;
//     }
//     public void color() {
//         System.out.println("Toyata Color should be White..");
//     }
// }
// class Neno implements Car {
//     public float speed(){
//         return sits;
//     }
//     public void color() {
//         System.out.println("Neno Red..");
//     }
// }

// public class Interface {
//     public static void main(String[] args) {
//         Car t = new Toyata();               //can be write reference variable
//         t.color();        
//         System.out.println(t.speed());
        
//         Car n = new Neno();
//         n.color(); 
//         System.out.println(n.speed());
//     }

// }





// //.....now java 8.0 version we can define method in interface.......bu "default" & "static" keyword.....

// interface A {
//     void disp1();
//     default void disp2() {                                      //.....default method.....
//         System.out.println("default method");
//     }
//     static void disp3() {                                       //.....staic method....
//         System.out.println("static method");                                
//     }
// }
// class Demo implements A{
//     public void disp1() {
//         System.out.println("dis method");
//     }
// }
// class Interface {
//     public static void main(String[] args) {
//         A obj = new Demo();
//         obj.disp1();
//         obj.disp2();
//         A.disp3();
//     }
// }




//...one class implements more than one interface at a time
//...all declare methods define mandatory....

interface A {
    void methodA();
}
interface B extends A {
    void methodB();
}
interface C extends A, B{
    void methodC();
}

class X implements A,B,C {
    public void methodA() {
        System.out.println("A interface method");
    }
    public void methodB() {
        System.out.println("B interface method");
    }
    public void methodC() {
        System.out.println("C interface method");
    }
}

class Interface {
    public static void main(String[] args) {
        X obj = new X();
        obj.methodA();
        obj.methodB();
        obj.methodC();

    }
}