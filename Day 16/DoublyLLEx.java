class Node{
    int data;
    Node next;
    Node prev;
    Node(int data) {
        this.data = data;

    }
}
public class DoublyLLEx {
    static Node head;
    public static void main(String[] args) {
        
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(15);
        Node n4 = new Node(13);
        head = n1;
        head.prev = null;
        head.next = n2;
        n2.prev = head;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;
        n4.next = null;
        printForward();
        printBackward();

    }
    public static void printForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void printBackward() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    
}
