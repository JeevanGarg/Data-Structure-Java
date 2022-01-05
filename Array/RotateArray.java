import java.util.*;

public class RotateArray {
    
    public static int[] takeInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();

        int[] a=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        return a;
    }

    public static void reverse(int[] a,int i,int j)
    {
        int n=a.length;
        int temp;
        while(i<j)
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;

        }


    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] a=takeInput();
        int n=a.length;
        int k=sc.nextInt();
        reverse(a,0,n-1);
        int start=n-k;
        reverse(a,0,start-1);
        reverse(a,start,n-1);

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }


    }
}
