// Inserting at first in Linked List

package LinkedList-1;

public class LinkedListC {
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
        if (head == null) { //speacial case when existing LL is null, means we have no head and tail already
            head = tail = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head; // new node next points to the existing head just to link the new node to the exisiting LL
        head = newNode; // now head is changed to newNode
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}
