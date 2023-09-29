class FirstClass {
    int a = 9999;
    void print1() {
        System.out.println("First class......."+a);
    }
}
class ChildClass extends FirstClass {
    void print2() {
        System.out.println("Second Class......."+a);
    }
}

class Inheritance {
    public static void main(String[] args) {
        ChildClass ob = new ChildClass();               //child class object
        ob.print1();
        ob.print2();
    }
}




// class Inheritance {
//     int x = 10;
//     // x=10;
//     public static void main(String[] args) {
//         Inheritance ob = new Inheritance();
//         ob.x;
//     }
// }