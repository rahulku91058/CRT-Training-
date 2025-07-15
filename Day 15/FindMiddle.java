
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null; 
    }
}
public class FindMiddle {
    static Node head;
    public static void main(String[] args) {
        
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(18);
        Node n5 = new Node(15);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
        head = n1;
        System.out.print(middle(head).data);
    }

    static Node middle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow =slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
}
