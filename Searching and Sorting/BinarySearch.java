import java.util.*;

public class BinarySearch {

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
        int s=0;
        int e=a.length-1;
        System.out.println("Enter the Element to be search");
        int x=sc.nextInt();
        int flag=0;

        while(s<=e){
            int mid=(s+e)/2;

            if(a[mid]==x){
                flag=1;
            }
            else if(a[mid]>x){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }

        if(flag==1){
            System.out.println("Found");
        }
        else{
            System.out.print("Not Found");
        }
    }
    
}
