// import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;

public class ForEachMethod {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(12);
        li.add(2);
        li.add(45);
        li.add(25);
        li.add(11);
        li.add(999);
        System.out.println(li);

    //..or...
        List<Integer> li2 = Arrays.asList(12,2,45,25,11,99);
        System.out.println(li2);


//traverse........
        // for (Integer i : li2) {
        //     System.out.println(i);
        // }
    //...or...
        // li2.forEach(n->System.out.println(n));
    //...or....
        Consumer<Integer> cn = new Consumer<>() {           //..not a object creation....anonymous inner class
            @Override
            public void accept(Integer i){
                System.out.println(i);
            }
        };
        li.forEach(cn);
    }    
}
