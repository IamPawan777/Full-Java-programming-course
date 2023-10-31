
class First {
    void firstPrint() {
        System.out.println("First class");
    }
}
class Second extends First {
    void firstPrint() {
        System.out.println("Inherit class");
    }
    void secondPrint() {
        System.out.println("Second class");
    }
    void newPrint() {
        System.out.println("specialized method");
    }
}
public class UpDownCasting {
    public static void main(String[] args) {
        First obj = new Second();               //upcating (also acheive polymorphism)
        obj.firstPrint();        
        ((Second)obj).secondPrint();        //down casting  (temporary change to child type class ) 
        ((Second)obj).newPrint();        
     
        
    }
}
