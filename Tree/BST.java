public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (root.data > value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        } // use this function for verification 
        inorder(root.left);
        System.out.print(root.data + " "); // Use print instead of println
        inorder(root.right);
    }
     // Search in BST 
     static boolean search(Node root, int value){
       if(root == null){
        return false;
       }
       if(root.data > value){
        return search(root.left, value);
       }else if(root.data == value){
        return true;   
       }else{ // (root.data < value) no need for condition.
        return search(root.right, value);
    }
}    
    public static void main(String args[]) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println(); // Add a newline after printing the inorder traversal
        // 
        if(search(root,1)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
