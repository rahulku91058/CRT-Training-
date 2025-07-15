public class CheckLoopLL {
    static Node head;

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(5);
        Node n3 = new Node(20);
        Node n4 = new Node(23);
        Node n5 = new Node(45);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n3;

        head = n1;
        System.out.println(hasLoop(head));
    }

    static boolean hasLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println(fast.data);
                return true;

            }

        }
        return false;
    }

}
