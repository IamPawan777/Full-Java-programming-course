import java.util.*;

class ArrayDeq {
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque();
        ad1.add(23);
        ad1.add("naveen");
        ad1.add("naveen");
        System.out.println(ad1);

        ad1.addFirst('P');                  //add starting
        ad1.addLast('B');                   //add ending
        System.out.println(ad1);

        ad1.offer(232323);                  //value may be insert or not also it is not mandatory
        System.out.println(ad1);

        System.out.println(ad1.contains(23));                   
        }
}