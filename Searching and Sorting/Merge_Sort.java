// cadeavaga - Replace a with b
import java.util.Scanner;
import java.util.*;

import java.util.*;

public class Merge_Sort {

    public static void merge(int b[],int c[],int d[]){
        int i=0,j=0,k=0;
        int l1=b.length;
        int l2=c.length;

        while(i<l1 && j<l2){
            if(b[i]<=c[i]){
                d[k]=b[i];
                i++;
                k++;
            }
            else{
                d[k]=c[j];
                j++;
                k++;
            }
        }

        while(i<l1){
            d[k]=b[i];
            i++;
            k++;
        }

        while(j<l2){
            d[k]=c[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int a[])
    {
        if(a.length<=1){
            return;
        }

        int b[]=new int[a.length/2];
        int c[]=new int[a.length-b.length];

        for(int i=0;i<a.length/2;i++){
            b[i]=a[i];
        }

        for(int i=a.length/2;i<a.length;i++){
            c[i- (a.length/2)] = a[i];
        }

        mergeSort(b);
        mergeSort(c);
        merge(b,c,a);

    }

   
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        mergeSort(a);
        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
    
}
