// package LinkedList;

public class CircularLL {
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    static void disp(Node head) {
        Node temp = head.next;
        while(temp != head){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node one = new Node(11);
        Node head = one;
        Node two = new Node(22);
        Node three = new Node(33);
        Node four = new Node(44);
        Node five = new Node(55);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = one;
        System.out.print(head.data+" ");
        disp(head);
    }
}
