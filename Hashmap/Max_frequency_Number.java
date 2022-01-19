import java.util.*;
public class Max_frequency_Number {

    public static int remove(int arr[]){
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i:arr){
            if(map.containsKey(i)){
                int val=map.get(i);
                val++;
                map.put(i,val);
            }
            map.put(i,1); 
        }

        int max=0;
        Set<Integer> key=map.keySet();

        for(int i:key){
            if(max<=map.get(i)){
                max=i;
            }
        }
        return max;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans=remove(arr);
        System.out.print(ans);
    }
    
}
