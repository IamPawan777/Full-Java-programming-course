package Queue;

// import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Basic_Deque {
    public static void main(String[] args) {
        // Deque dq = new ArrayDeque<>();
        Deque dq = new LinkedList<>();
      
        dq.add(11);
        dq.addLast(22);
        dq.addLast(33);
        dq.addFirst(44);
        dq.addFirst(11);
        dq.addFirst(55);
        System.out.println(dq);

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq.getFirst());

        System.out.println(dq.removeFirst());
        System.out.println(dq);

        dq.removeLastOccurrence(11);                // last 11 delete
        System.out.println(dq);

    }
}
