import java.util.*;

public class MergeTwoSotedArray {

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

    public static int[] merge(int[] a,int[] b)
    {
        int l1=a.length;
        int l2=b.length;
        int[] c=new int[l1+l2];
        int i=0,j=0,k=0;

        while(i<l1 && j<l2){
            if(a[i]<b[j]){
                c[k]=a[i];
                k++;
                i++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }
        }

        while(i<l1){
            c[k]=a[i];
            k++;
            i++;
        }

        while(j<l2){
            c[k]=b[j];
            k++;
            j++;
        }

        return c;

    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=takeInput();
        int[] b=takeInput();

        int[] c=merge(a,b);

        for(int k=0;k<c.length;k++)
        {
            System.out.print(c[k]);

        }
    }
    
}
