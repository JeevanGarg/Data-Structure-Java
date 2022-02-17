//Balanced Paranthesis

import java.util.Scanner;
import java.util.Stack;
import java.util.*;

public class Valid_Paranthesis {

    public static void main(String[] args)
    {
       Stack<Character> stack=new Stack<>();
       Scanner sc=new Scanner(System.in);
       String str=sc.next();

       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{'){
               stack.push(str.charAt(i));
           }
           else if(str.charAt(i)==')' || str.charAt(i)==']' || str.charAt(i)=='}'){
               if(stack.isEmpty()){
                  System.out.print("false");
                  return;
               }
               char top=stack.peek();
               if(top=='(' && str.charAt(i)==')' || top=='[' && str.charAt(i)==']' || top=='{' && str.charAt(i)=='}'){
                   stack.pop();
               }

           }
       }
       if(stack.isEmpty()){
           System.out.println("true");
       }
       else{
           System.out.print("false");
       }
    }
    
}
