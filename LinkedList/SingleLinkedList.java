class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SingleLinkedList {
    public static Node createSingleLinkedList(int information, int N) {
        Node first = null;
        Node prev = null;
        Node cur = null;

        // Step 1: Create the first node
        cur = new Node(information);
        first = prev = cur;

        // Step 2-10: Create N-1 more nodes
        for (int i = 1; i < N; i++) {
            // Step 6: Create a new node
            cur = new Node(information);

            // Step 9: Connect the nodes
            prev.next = cur;

            // Step 10: Shift the pointer to the last node
            prev = cur;
        }

        // Return the reference to the first node of the linked list
        return first;
    }

    public static void main(String[] args) {
        int information = 42; // Replace with your desired information
        int N = 5; // Replace with the number of nodes you want

        // Create a single linked list with N nodes
        Node firstNode = createSingleLinkedList(information, N);

        // Print the linked list to verify
        Node current = firstNode;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
    }
}
