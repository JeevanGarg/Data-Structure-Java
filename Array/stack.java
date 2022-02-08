import java.util.Stack;

public class stack {

    public static void main(String[] args)
    {
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.peek());  //top element
        stack.remove(1);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
    
}
