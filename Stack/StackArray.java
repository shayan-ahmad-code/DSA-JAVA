public class StackArray {
    public class Stack {

        int MAX;
        int[] StackArray;
        int top;

        public Stack(int size) {
            MAX = size;
            StackArray = new int[MAX];
            top = -1;
        }

        public void push(int item) {
            if (top == MAX - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            top++;
            StackArray[top] = item;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;
            }
            for (int i = 0; i <= top; i++) {
                System.out.print(StackArray[i] + " "); // Use print instead of println
            }
            System.out.println(); // Add a newline after printing the stack
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {
        StackArray stackArray = new StackArray(); // Create an instance of StackArray
        StackArray.Stack stack = stackArray.new Stack(5); // Create an instance of Stack within StackArray

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
    }
}
