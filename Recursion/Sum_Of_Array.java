// 412-  four one two

import java.util.Scanner;
import java.util.*;

import java.util.*;

public class Sum_Of_Array {

    public static int sum(int a[]){
       if(a.length==1){
           return a[0];
       }

       int small[]=new int[a.length-1];
       for(int i=1;i<a.length;i++){
           small[i-1]=a[i];
       }

       int ans=sum(small);
       return a[0]+ans;
    }

   
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int result=sum(arr);
        System.out.println(result);
       
    }
    
}
