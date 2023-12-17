import java.util.Scanner;
public class RangegreaterInLinkedList {
    private Node head;
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void deleteGreaterThan25() {
        if (head == null) {
            return; // Nothing to delete
        }

        // Remove nodes with values greater than 25 from the beginning of the list
        while (head != null && head.data > 25) {
            head = head.next;
        }

        if (head == null) {
            return; // All nodes were removed
        }

        // Remove nodes with values greater than 25 from the rest of the list
        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            if (currNode.data > 25) {
                prevNode.next = currNode.next;
            } else {
                prevNode = currNode;
            }
            currNode = currNode.next;
        }
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            RangegreaterInLinkedList list = new RangegreaterInLinkedList();

            System.out.println("Enter elements (numbers in the range of 1-50) for the linked list (type 'done' to finish):");
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("done")) {
                    break;
                }
                int num = Integer.parseInt(input);
                if (num >= 1 && num <= 50) {
                    list.add(num);
                } else {
                    System.out.println("Please enter a number in the range of 1-50.");
                }
            }

            System.out.println("Original Linked List:");
            list.printList();

            list.deleteGreaterThan25();

            System.out.println("Linked List after deleting nodes with values greater than 25:");
            list.printList();
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}


