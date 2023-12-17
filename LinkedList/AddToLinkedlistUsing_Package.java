import java.util.LinkedList;

public class AddToLinkedlistUsing_Package {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("Shayan");
        list.addLast("Nothing");

        // Using an enhanced for loop to print elements
        for (String element : list) {
            System.out.println(element);
        }
    }
}
