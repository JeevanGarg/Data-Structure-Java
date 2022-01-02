import java.util.Scanner;

public class sumOfSubArray {
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
        int sum;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum=sum+a[j];
                System.out.println(sum);
            }

        }
    }
    public static void main(String[] args)
    {
        int[] a=takeInput();
        subarray(a);

    }
}
