
import java.util.ArrayList;
import java.util.Collection;
public class ArrayList1 {
    public static void main(String args[]){
    ArrayList<Integer>list = new ArrayList<>();
     // add element
     list.add(10);
     list.add(9);
     list.add(7);
    // System.out.println(list);
     // get 
      int element = list.get(1);
      System.out.println(element);
      // adding in between
      list.add(0, 1);
       System.out.println(list);
       // set 
       list.set(3, 1);
       System.out.println(list);
     // find size 
     int size = list.size();
     System.out.println(size);
     // loop 
     for(int i = 0 ; i<list.size(); i++){
        System.out.println(i);
     }
     // sorting 
     collections.sort(list);
}
}