// Inserting at Tail in Linked List

public class LinkedListD {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst (int data) {
        if (head == null) {
            head = tail = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        if (head == null) {
            head = tail = new Node(data);
            return;
        }
				Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
    }

    public static void main(String args[]) {
        LinkedListD ll = new LinkedListD();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
    }
}
