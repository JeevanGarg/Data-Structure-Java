import java.util.*;

public class InsertionSort {

    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }

        return a;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=takeInput();
        int n=a.length;
        int temp,j;

        for(int i=1;i<n;i++){
            temp=a[i];
            j=i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
