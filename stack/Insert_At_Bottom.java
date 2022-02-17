//Balanced Paranthesis

import java.util.Scanner;
import java.util.Stack;
import java.util.*;

public class Insert_At_Bottom {

    public static void insertAtBottom(Stack<Integer> stack,int x){
        if(stack.isEmpty()){
            stack.push(x);
            return;
        }
        int n=stack.peek();
        stack.pop();
        insertAtBottom(stack, x);
        stack.push(n);
    }

    public static void main(String[] args)
    {
       Stack<Integer> stack=new Stack<>();
       Scanner sc=new Scanner(System.in);
       int arr[]=new int[5];

       for(int i=0;i<5;i++){
           arr[i]=sc.nextInt();
       }

       for(int i=0;i<5;i++){
           stack.push(arr[i]);
       }

       insertAtBottom(stack,10);

       while(!stack.isEmpty()){
           System.out.print(stack.pop()+" ");
       }

       
    }
    
}
