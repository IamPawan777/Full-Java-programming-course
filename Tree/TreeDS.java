package Tree;

public class TreeDS {
    public static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;

        System.out.println("Root: " + root.data);
        System.out.println("Left: " + a.data);
        System.out.println("Right: " + root.right.data);
    }
}
