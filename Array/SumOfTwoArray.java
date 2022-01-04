import java.util.*;

public class SumOfTwoArray {
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
        int[] b=takeInput();
        ArrayList<Integer> arr=new ArrayList<>();
        int l1=a.length;
        int l2=b.length;

        int i=l1-1;
        int j=l2-1;
        int carry=0,sum=0;

        while(i>=0 && j>=0)
        {
            sum=a[i]+b[j]+carry;
            carry=sum/10;
            sum=sum%10;
            arr.add(sum);
            i--;
            j--;
        }

        while(i>=0){
            sum=a[i]+carry;
            carry=sum/10;
            sum=sum%10;
            arr.add(sum);
            i--;
        }

        while(j>=0){
            sum=b[j]+carry;
            carry=sum/10;
            sum=sum%10;
            arr.add(sum);
            j--;
        }

        while(carry!=0){
            sum=carry;
            carry=carry/10;
            sum=sum%10;
            arr.add(sum);
        }

        for(int k=arr.size()-1;k>=0;k--){
            System.out.print(arr.get(k)+" ");
        }

    }
}
