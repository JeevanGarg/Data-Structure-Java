import java.util.*;
public class Print_Intersection {

    public static ArrayList<Integer> Intersection(int a1[],int a2[]){
        ArrayList<Integer> arr=new ArrayList<>();
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<a1.length;i++){
            if(map.containsKey(a1[i])){
                 int val=map.get(a1[i]);
                 val++;
                 map.put(a1[i],val);
            }
            map.put(a1[i],1);
        }

        for(int i=0;i<a2.length;i++){
            if(map.containsKey(a2[i])){
                int freq=map.get(a2[i]);
                if(freq>0){
                    arr.add(a2[i]);
                    map.put(a2[i],freq--);
                }
            }
        }
        return arr;

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
        int[] a2=takeInput();

        ArrayList<Integer> ans=Intersection(a1,a2);
        System.out.print(ans);
    }
    
}
