//Find duplicate element ina an array

import java.util.*;

public class ArrayIntersection {

    public static int[] takeInput(){
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

        Arrays.sort(a);
        Arrays.sort(b);

        int l1=a.length-1;
        int l2=b.length-1;
        int i=0,j=0;

        while(i<l1 && j<l2){
            if(a[i]==b[j])
            {
                arr.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[i]){
                
                i++;
            }
            else{
                j++;
            }
        }

        for(int k:arr){
            System.out.print(k);
        }

        

        
    }
    
}
