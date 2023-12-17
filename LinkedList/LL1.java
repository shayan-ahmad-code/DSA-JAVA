public class LL1 {
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
          Node ptr = new Node(data);
          if(head == null){
               head = ptr;
               return;
          }
          ptr.next = head;
          head = ptr;
      }
      public void addLast(String data){
          Node ptr = new Node(data);
          if(head == null) {
              head = ptr;
              return;
          }
          Node lastNode = head;
          while(lastNode.next != null) {
              lastNode = lastNode.next;
          }
            lastNode.next = ptr;
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
          LL1 list = new LL1();
          list.addFirst("Shayan");
          list.addFirst("Hey");
          list.addLast("Nothing to do!");
          list.print();
      }
  }

