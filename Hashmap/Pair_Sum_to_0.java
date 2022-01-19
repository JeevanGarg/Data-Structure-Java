import java.util.*;
public class Pair_Sum_to_0 {

    public static int pairSum(int a1[]){
    
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<a1.length;i++){
            if(map.containsKey(a1[i])){
                 int val=map.get(a1[i]);
                 val++;
                 map.put(a1[i],val);
            }
            else{
                map.put(a1[i],1);
            }
           
        }
        int count=0;

        Set<Integer> key=map.keySet();
       
        for(int i:key){
            if(map.containsKey(-i) && i!=0){
                count=count+map.get(i)*map.get(-i);
            }
        }
        count=count/2;

        if(map.containsKey(0)){
            int n=map.get(0);
            count=count+(n*(n-1)/2);
        }
        
        return count;

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
        int ans=pairSum(a1);
        System.out.print(ans);
    }
    
}
