import java.util.*;

public class Sort_0_1 {
    
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

    public static void swap(int i,int j,int a[]){
        int temp;

        temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
    public static void main(String[] args){
        int[] a=takeInput();
        int n=a.length;

        int i=0,j=n-1;

        while(i<j){
            if(a[i]==0){
                i++;
            }
            else if(a[j]==1){
                j--;
            }
            else{
                swap(i,j,a);
                i++;
                j--;
            }
        }

        for(int k=0;k<n;k++){
            System.out.print(a[k]+" ");
        }

    }
}
