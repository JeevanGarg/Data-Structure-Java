import java.util.*;
public class Remove_Duplicates {

    public static ArrayList<Integer> remove(int arr[]){
        
        ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i:arr){
            if(map.containsKey(i)){
                continue;
            }
            a.add(i);
            map.put(i,1);
        }
        return a;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        ArrayList<Integer> a=remove(arr);
        System.out.print(a);
    }
    
}
