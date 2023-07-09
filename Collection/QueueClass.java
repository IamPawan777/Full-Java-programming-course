//........in java linked List use as a queue.........

import java.util.*;

class QueueClass {
    static void queueExample() {
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(23);                           //offer is use to insert (can use add() but in empty array exception throw)
        qu.offer(77);
        qu.offer(1);
        
        System.out.println(qu);
        System.out.println(qu.peek());              //return front element but not remove (element() use but exception)            
        System.out.println(qu.poll());              //return front element but remove from queue (remove() use but exception)
        System.out.println(qu);

    }
    public static void main(String[] args) {
        queueExample();
    }
}