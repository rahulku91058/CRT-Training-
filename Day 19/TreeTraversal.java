
class Node{
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }   
}
public class TreeTraversal {
    
    Node root;

    void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();
        
        // tree.root = new Node(4);
        // tree.root.left = new Node(6);
        // tree.root.right = new Node(18);
        // tree.root.left.left = new Node(7);
        // tree.root.left.right = new Node(9);
        // tree.root.left.left.left = new Node(16);
        // tree.root.right.left = new Node(10);
        // tree.root.right.right = new Node(12);

        tree.root = new Node(7);
        tree.root.left = new Node(10);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(12);
        tree.root.right.right = new Node(16);
        tree.root.right.right.right = new Node(13);

        System.out.println("Inorder traversal:");
        tree.inorder(tree.root);

        System.out.println("\nPreorder traversal:");
        tree.preorder(tree.root);

        System.out.println("\nPostorder traversal:");
        tree.postorder(tree.root);
    }
}