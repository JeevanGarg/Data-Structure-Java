import java.util.*;
public class Pair_with_difference_k {

    public static int differnce(int a[],int k)
    {
        
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i:a){
            if(map.containsKey(i))
            {
                int val=map.get(i);
                val++;
                map.put(i, val);

            }
            else{
                map.put(i, 1);
            }
        }

        Set<Integer> key=map.keySet();
        int count=0;
        if(k==0)
        {
            for(int i:a){
                int val=map.get(i);
                count=count+(val*(val-1)/2);
                return count;
            }

        }
        else{
            

            for(int i:a){
                if(map.containsKey(i+k))
                {
                    count=count+map.get(i)*map.get(i+k);

                }
                else if(map.containsKey(i-k))
                {
                    count=count+map.get(i)*map.get(i-k);

                }
            }
            

        }

        return count/2;

    }

    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Input");
        int n=sc.nextInt();
        int a1[]=new int[n];
        
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }
        return a1;
    }

    public static void main(String[] args){

        int[] a1=takeInput();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter k difference");
        int k=sc.nextInt();
        int ans = differnce(a1,k);
        System.out.print(ans);
    }
    
}
