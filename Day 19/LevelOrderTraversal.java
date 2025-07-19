import java.util.*;
class Node{
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }   
}
public class LevelOrderTraversal {
    Node root;
    void levelOrder(Node root){
        if(root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
    public static void main(String[] args) {
        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new Node(7);
        tree.root.left = new Node(10);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(12);
        tree.root.right.right = new Node(16);
        tree.root.right.right.right = new Node(13);

        System.out.println("Level Order Traversal:");
        tree.levelOrder(tree.root);
    
    }
    
}
