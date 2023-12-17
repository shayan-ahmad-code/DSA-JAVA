public class SingleLinkedListOf_Array {
    class Solution
{
    public static class Node
    {
        int data;
        Node next;

        Node() {}
        Node(int data) { this.data = data; }
        Node(int data, Node next) { this.data = data; this.next = next; }
    }

    public static Node construct(int[] keys)
    {
        Node head = null;  // Initialize the head to null initially

        // Iterate through the array in reverse order
        for (int i = keys.length - 1; i >= 0; i--)
        {
            // Create a new node with the current array element and link it to the current head
            Node newNode = new Node(keys[i], head);

            // Update the head to the newly created node
            head = newNode;
        }

        return head;  // Return the head of the constructed linked list
    }

    // Helper function to print the linked list
    public static void printList(Node head)
    {
        Node current = head;
        while (current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        int[] keys = {1, 2, 3, 4, 5};

        Node head = construct(keys);

        System.out.println("Linked List:");
        printList(head);
    }
}

}
