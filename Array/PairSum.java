import java.util.*;

public class PairSum {

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

    public static void main(String[] args){
        int[] a=takeInput();
        Scanner sc=new Scanner(System.in);

        int n=a.length;
        System.out.println("Enter the element to find pair sum");
        int x=sc.nextInt();
        int count=0;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==x){
                    count++;

                }
            }

        }

        System.out.println(count);
        
    }     
    
}
