class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class UpdateHead {
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
        

        print(head);    
        add(55);
        print(head);
        // UpdateHead l=new UpdateHead();
        // l.add(4);
        // l.add(5);
        // l.add(3);
        // l.add(8);
        // l.print();
        
    }
    static public void add(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        
    }
    static public void print(Node head){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;

        }
        System.out.println("null");
    }
    
}
