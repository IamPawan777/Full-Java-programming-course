// // Inner class type : member, static, anonymous
 
// class A {
//     void disA() {
//         System.out.println("In A");
//     }
//     class B {               //member inner class
//         void dispB() {
//             System.out.println("in B.....");
//         }
//     }
//     static class C {               //static inner class
//         void dispC() {
//             System.out.println("in C....");
//         }
//     }
// }
// public class InnerLambdaExp {
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.disA();

//         A.B o = obj.new B();
//         o.dispB();

//         A.C oo = new A.C();
//         oo.dispC();
//     }
// }





// anonymous class....

// interface I1 {
//     void drive();
// }
// class InnerLambdaExp{
//     public static void main(String[] args) {        
//         I1 obj = new I1() {                         //......anonymouus class......it is inner class...
//             public void drive() {
//                 System.out.println("Anonymous class.....");
//             }
//         };

//         obj.drive();
//     }
// }





//....Lambda expression..use in functional interface only (interface which have only one method)....

@FunctionalInterface                                 //..optional.....
interface I1 {
    // void drive(int a);       //only one method possible in functional interface
    int dis(int b);
}
class InnerLambdaExp{
    public static void main(String[] args) {        
        // I1 obj = (int aaa) -> System.out.println("Anonymous class....."+aaa);
        I1 obj2 = (int bb) -> bb*bb;

        // obj.drive(12);
        System.out.println(obj2.dis(3));
    }
}


