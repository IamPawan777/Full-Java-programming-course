import java.util.*;

public class CollectionsClass {
    public static void main(String[] args) {
    ArrayList li = new ArrayList();
    li.add(12);
    li.add(3);
    li.add(98);
    li.add(67);
    li.add(67);
    li.add(1);
    li.add(34);
    li.add(34);
    li.add(89);
    li.add(67);

    System.out.println(li);

    Collections.sort(li); 
    
    // Collections.rotate(li,2);
    
    // Collections.shuffle(li);
    
    // int a = Collections.frequency(li, 67);
    // System.out.println(a);
    
    // Collections.swap(li, 0, 3);
    
    // Collections.reverse(li);
    // Collections.sort(li, Collections.reverseOrder());

    System.out.println(li);

    
    }

}
