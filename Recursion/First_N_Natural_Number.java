// 412-  four one two

import java.util.Scanner;
import java.util.*;

import java.util.*;

public class First_N_Natural_Number {

    public static void Natural(int n){

        if(n==0){
            return;
        }
        Natural(n-1);
        System.out.print(n+" ");
    }

   
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Natural(n);
       
    }
    
}
