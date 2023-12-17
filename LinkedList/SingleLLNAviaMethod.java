import java.util.List;

class Node
{
    int data;
    Node next;
 
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
 
class Main
{
    // Helper function to print a given linked list
    public static void printList(Node head)
    {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
 
        System.out.println("null");
    }
 
    // Naive function for linked list implementation containing three nodes
    public static Node constructList()
    {
        // construct linked list nodes
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
 
        // rearrange the references to construct a list
        Node head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
 
        // return reference to the first node in the list
        return head;
    }
 
    public static void main(String[] args)
    {
        // `head` points to the head node of the linked list
        Node head = constructList();
 
        // print linked list
        printList(head);
    }
}


