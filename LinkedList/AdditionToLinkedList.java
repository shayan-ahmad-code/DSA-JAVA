public class AdditionToLinkedList{
      Node head;
    private LL.Node newNode;
    class Node{
        String data;
        Node next;
        
         Node(String data){
            this.data = data;
            this.next = null;
         }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
             head = newNode;
             return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
          lastNode.next = newNode;
    }
 
    public void print(){
        if(head == null){
            System.out.println("List is Empty");
            return;}
        Node currNode = head; 
         while (currNode != null) {
            System.out.println(currNode.data+"->");
            currNode = currNode.next; 
         }

    }
    public static void main(String args[]){
        AdditionToLinkedList list = new AdditionToLinkedList();
        list.addFirst("Shayan");
        list.addFirst("Hey");
        list.addLast("Nothing to do!");
        list.print();
    }
}