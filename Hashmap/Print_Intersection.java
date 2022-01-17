import java.util.*;
public class Solution {

	public static void intersection(int[] arr1, int[] arr2) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                int val=map.get(arr1[i]);
                val++;
                map.put(arr1[i],val);
            }
            map.put(arr1[i],1);
        }
        
        for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])){
                int freq=map.get(arr2[i]);
                if(freq>0){
                    System.out.print(arr2[i]+" ");
                    freq--;
                }
            }
        }
    }
}