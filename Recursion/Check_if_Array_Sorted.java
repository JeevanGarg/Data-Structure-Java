// 412-  four one two

import java.util.Scanner;
import java.util.*;

import java.util.*;

public class Check_if_Array_Sorted {

    public static boolean isSorted(int a[]){
        if(a.length==1){
            return true;
        }
        if(a[0]>a[1]){
            return false;
        }

        int[] small=new int[a.length-1];

        for(int i=1;i<a.length;i++){
            small[i-1]=a[i];
        }

        boolean result=isSorted(small);
        return result;

    }

   
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        boolean result=isSorted(arr);
        System.out.println(result);
       
    }
    
}
