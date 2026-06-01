// Insert at the Kth position of Linked List

public class LinkedListF {
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
    
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
 
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        
        while (i < idx-1) {
            temp = temp.next;
            i++;
        }
        
        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
 
    public static void main(String args[]) {
        LinkedListF ll = new LinkedListF();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,9);
        ll.print();
    }
}
