
public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);

        ll.print(); // 1 -> 2 -> 3 -> 4 -> 5 -> null

        ll.removeFirst();
        ll.print(); // 2 -> 3 -> 4 -> 5 -> null

        ll.removeLast();
        ll.print(); // 2 -> 3 -> 4 -> null

        System.out.println(ll.itrSearch(3));  // 1
        System.out.println(ll.itrSearch(10)); // -1
        System.out.println("Size of LL is: " + ll.getSize());
    }
}