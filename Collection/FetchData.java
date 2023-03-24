import java.util.*;

public class FetchData {
    public static void main(String[] args) {  
        ArrayList al = new ArrayList();
        al.add(33);
        al.add(11);
        al.add(99);
        al.add(66);
        al.add(44);
        al.add(77);
        al.add(55);
        al.add(11);

        System.out.println(al);         //only print on console...have not fatch the data....


        //....1st way......
        System.out.println("for loop: ");
        for (int i = 0; i < al.size(); i++) {           //it is only used index base collection class...not fatch data....which is not support index base 
            System.out.print(al.get(i)+" ");               //not for ArrayDeque, PriorityQueue, TreeSet,  HashSet, LinedHashSet
        }
        System.out.println();
        

        //....2nd way.........
        System.out.println("for-each loop: ");
        for(Object i:al) {
            System.out.print(i+" ");
        }
        System.out.println();

        
        //.......3rd way.........//......recommeded to use for collection ( forword direction )
        System.out.println("iterator: ");
        int sum =0;
        Iterator itr = al.iterator();
        while(itr.hasNext()) {
            Integer i = (Integer)itr.next();
            sum += i;
            // System.out.print(itr.next()+" ");
        }
        System.out.println(sum);
        
        
        //........4th............
        System.out.println("list iterator: ");
        ListIterator litr = al.listIterator(al.size());
        while(litr.hasPrevious()) {
            System.out.print(litr.previous()+" ");
        }
    }
}
