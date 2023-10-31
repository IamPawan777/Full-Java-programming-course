//......for "abstract method" mendotory to use "abstract class"....
//.......all abstract method compalsory to define after inherited..........

abstract class Car {
    // abstract int a = 10;        // abstract variable not allowed
    abstract void drive();
    static void color() {
        System.out.println("Color method.......");
    }
    void design() {
        System.out.println("outstading.........");
    }
    Car() {
        System.out.println("abstract class Constructor........");
    }
}

class Alto extends Car {
    void drive() {
        System.out.println("Drive method alto.....");
    }
}

class Toyota extends Car {
    void drive() {
        System.out.println("Drive method toyota.....");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Car c = new Alto();
        c.drive(); 
        c.color(); 
        c.design();   
        System.out.println("---------------");
        Car d = new Toyota();
        d.drive();
    }
}
