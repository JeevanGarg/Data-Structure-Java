import java.util.Scanner;
import java.util.ArrayList;

public class Remove_consecutive_Duplicates {

    public static ArrayList<Integer> remove(int a[]){
        int n= a.length;
        ArrayList<Integer> result=new ArrayList<Integer>();
        result.add(a[0]);

        for(int i=1;i<n;i++)
        {
            if(a[i]!=a[i-1]){
                result.add(a[i]);
            }

        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        ArrayList<Integer> arr=remove(a);

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }

    }
    
}
