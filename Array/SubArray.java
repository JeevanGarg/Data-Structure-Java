
import java.util.*;

public class SubArray {

    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        return a;

    }

    public static void subarray(int[] a){
        int n=a.length;
       
        for(int i=0;i<n;i++){
            
            for(int j=i;j<n;j++){
              
               for(int k=i;k<=j;k++){
                   System.out.print(a[k]+" ");
               }
                System.out.println();
            }


        }
    }
    public static void main(String[] args)
    {
        int[] a=takeInput();
        subarray(a);

    }
}

