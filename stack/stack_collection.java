//Stack is a linear data structure which follows particular order in which operations are performed.
//The order may be LIFO or FILO.

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

        System.out.println("top element is"+ stack.peek());  //top element
       // stack.remove(1);

        System.out.println("size of stack is"+ stack.size());

        System.out.println("3 element of stack is"+ stack.get(2));

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
    
}
