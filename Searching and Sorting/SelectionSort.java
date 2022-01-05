import java.util.*;

public class SelectionSort {

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
        int temp;

        for(int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE;
            int minIndex=-1;

            for(int j=i;j<n;j++)
            {
                if(a[j]<min){
                    min=a[j];
                    minIndex=j;
                }

            }

           temp=a[i];
           a[i]=a[minIndex];
           a[minIndex]=temp;
            
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
