//Queue

import java.util.*;

public class Reverse_Queue_Using_Recursion {

    public static Queue<Integer> reverse(Queue<Integer> q1){
        if(q1.isEmpty()){
            return q1;
        }

        int n=q1.peek();
        q1.poll();
        reverse(q1);
        q1.add(n);
        return q1;
    }
    

    public static void main(String[] args)
    {
       Stack<Integer> stack=new Stack<Integer>();
       Queue<Integer> queue=new LinkedList<>();
       queue.add(10);
       queue.add(20);
       queue.add(30);
       queue.add(40);
       queue.add(50);
       
       Queue<Integer> q1=reverse(queue);

       while(!q1.isEmpty()){
           System.out.print(q1.poll()+" ");
       }

    }
    
}
