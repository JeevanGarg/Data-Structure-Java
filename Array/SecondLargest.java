import java.util.*;

public class SecondLargest {
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
        int n=a.length;

        Arrays.sort(a);
        
        int last=a[n-1];
        int secondLarge=0;

        for(int i=n-2;i>=0;i--){
            if(a[i]!=last)
            {
                secondLarge=a[i];
                break;

            }

        }

        System.out.println(secondLarge);

       

    }
    
}
