import java.util.HashMap;
import java.util.*;
public class Max_Frequency_Number {

    public static int maxFrequencyNumber(int[] arr)
    {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int val=map.get(arr[i]);
                val++;
                map.put(arr[i],val);
            }
            map.put(arr[i],1);
        }
        
        Set<Integer> key=map.keySet();
        
        for(int i:key){
            if(max<=map.get(i)){
                max=i;
                
            }
        }
        return max;
    }
}