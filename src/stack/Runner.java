package stack;


public class Runner {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(12);
        stack.push(13);
        stack.push(10);
        stack.push(17);

        System.out.println("Pop \n"+ stack.pop());
        System.out.println("Peek  \n \t"+ stack.peek());

        stack.show();
    }
}
