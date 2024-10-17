 import java.util.Stack;

public class dian {

    public static void main(String[] args) {

        Stack<Integer> student = new Stack<>();
        
        // Push elements onto the stack
        student.push(1);
        student.push(2);
        student.push(3);

        System.out.println("Stack: " + student);

        // Pop and display the top element
        int topElement = student.pop();
        System.out.println("Popped: " + topElement);
        
        // Peek at the top element without removing it
        int peekedElement = student.peek();
        System.out.println("Peeked: " + peekedElement);

        // Check if the stack is empty
        boolean isEmpty = student.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty);

        // Get the size of the stack
        int stackSize = student.size();
        System.out.println("Stack Size: " + stackSize);
    }
}
