//Queue

import java.util.*;

public class Reverse_Queue {
    

    public static void main(String[] args)
    {
       Stack<Integer> stack=new Stack<Integer>();
       Queue<Integer> queue=new LinkedList<>();
       queue.add(10);
       queue.add(20);
       queue.add(30);
       queue.add(40);
       queue.add(50);
       
       while(!queue.isEmpty()){
           stack.push(queue.poll());
       }

       while(!stack.isEmpty()){
           System.out.print(stack.pop()+" ");
       }

    }
    
}
