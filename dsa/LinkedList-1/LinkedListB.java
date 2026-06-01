// Head & Tail in Linked List

public class LinkedListB {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null; // when you create a new node, it doesn't point to anything yet
        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String args[]) {
        LinkedListB ll = new LinkedListB(); // create a LinkedList object
				ll.head = new Node(1);            // head points to a new Node with data = 1
				ll.head.next = new Node(2);       // the next of head points to a new Node with data = 2

    }
}
