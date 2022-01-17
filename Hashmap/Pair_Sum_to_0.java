import java.util.*;

public class Solution {
	public static int PairSum(int[] input, int size) {
        
        if(size==0){
            return 0;
        }
        else{
            HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
            
            for(int i=0;i<size;i++){
                if(map.containsKey(input[i])){
                    int val=map.get(input[i]);
                    val++;
                    map.put(input[i],val);
                }
                else{
                     map.put(input[i],1);
                    
                }
                
            }
            
            Set<Integer> key=map.keySet();
            int count=0;
            
            for(int i:key){
                if(map.containsKey(-i) && i!=0){
                    count=(count+map.get(i)*map.get(-i));
 
                }
            }
            count=count/2;
            
            if(map.containsKey(0)){
                int n=map.get(0);
                count=count+(n*(n-1))/2;
            }
            
            return count;
        }
    }
}