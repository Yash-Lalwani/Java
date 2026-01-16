public class DeleteBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // This fuction will return the root
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        // left subtree
        if(root.data > val) {
            root.left = insert(root.left, val);
        }
        // right subtree
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    // Function to search if the key value exist in BST, True if exist, else false
    public static boolean search(Node root, int key) {
        if(root == null) {
            return false;
        }

        if(root.data == key) {
            return true;
        }

        if(root.data > key) {
            return search(root.left, key);
        }
        else {
            return search(root.right, key);
        }
    }

    // Method to delete a node
    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        }
        else if (root.data < val) {
            root.right = delete(root.right, val);
        }
        else { // point where we have the node to delete -> root.data == key
            // Case 1 -> No child (leaf node)
            if (root.right == null && root.left == null) {
                return null;
            }
            // Case 2 -> Single child
            if (root.right == null) {
                return root.left;
            } 
            else if (root.left == null) {
                return root.right;
            }
            // Case 3 -> both child
            Node IS = findInorderSuccessor(root.right); // cause always right subtree contains IS.
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    // to find the successor for case 3
    public static Node findInorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        // To verify if the correct BST is formed, we will do InOrder Traversal
        inOrder(root);
        System.out.println();

        // to test the search method
        if (search(root, 1)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        // to test the delete method
        root = delete(root, 6);
        System.out.println();

        inOrder(root);

    }
}