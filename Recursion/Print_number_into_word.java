//Eg 412-> four one two

import java.util.*;

public class Print_number_into_word 
{

    public static void say(int n,String arr[])
    {
        if(n==0){
            return;
        }

        int digit=n%10;
        n=n/10;
        say(n,arr);
        System.out.print(arr[digit]+" ");

    }

 

    public static void main(String[] args)
    {
        String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        say(n,arr);
        
        

    }
    
}
