import java.util.*;

class Demo<T> {
    T ob;
    Demo(T ob){
        this.ob = ob;
    }
    void disp() {
        System.out.println("type of data: "+ob.getClass().getName());
    }
    public T getOb() {              //..here T is return type like void
        return ob;
    }
}
public class Generic {
    public static void main(String[] args) {
        Demo<Integer> obj = new Demo<>(12);
        obj.disp();
        System.out.println(obj.getOb());

        Demo<String> obj2 = new Demo<>("harry");
        obj2.disp();
        System.out.println(obj2.getOb());

        List<Demo> li = new ArrayList<>(); 

        // Collection<String> li2 = new ArrayList<>();          //parent posible
        // List<Object> li = new ArrayList<Integer>();                //..erroe....object not posible;

    }
}
