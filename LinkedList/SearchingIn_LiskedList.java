public class SearchingIn_LiskedList {
    private Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
           head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
         currNode.next = newNode;
    }
    public int search(int target){
        int index = 0;
        Node currNode = head;
        while(currNode != null){
            if(currNode.data == target){
                return index;
            }
            currNode = currNode.next;
            index++;
        }
        return -1;
    }
    public static void main(String[] args){
        SearchingIn_LiskedList list = new SearchingIn_LiskedList();
        // add Element's
        list.add(5);
        list.add(9);
        list.add(7);
        list.add(0);
        list.add(3);
        list.add(8);
        list.add(2);
        int target = 3;
        int index = list.search(target);
        if(index != -1){
          System.out.println(target+" is Found at index "+index);
        }
    }
}
