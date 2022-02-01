// 412-  four one two

import java.util.Scanner;
import java.util.*;

import java.util.*;

public class sayDigit {

    public static void sayDigit(int n,String a[]){
        if(n==0){
            return;
        }

        int digit=n%10;
        n=n/10;
        sayDigit(n, a);
        System.out.print(a[digit]+" ");
    }


   
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

        sayDigit(n,a);
        
    }
    
}
