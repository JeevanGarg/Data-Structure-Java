
import java.util.Scanner;
import java.util.*;

import java.util.*;

public class quickSort {

    public static int partition(int a[],int i,int j){
        int pivot=a[i];

        while(i<j){
            while(a[i]<pivot){
                i++;
            }
            while(a[j]>pivot){
                j--;
            }

            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }

        }
        int temp=pivot;
        pivot=a[j];
        a[j]=temp;
        return j;
    }

    public static void QuickSort(int a[],int s,int e){
         if(s<e){
             int pivot=partition(a,s,e);
             QuickSort(a, s, pivot-1);
             QuickSort(a, pivot+1, e);
         }
    }

   
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        QuickSort(a,0,n-1);

        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
    
}
