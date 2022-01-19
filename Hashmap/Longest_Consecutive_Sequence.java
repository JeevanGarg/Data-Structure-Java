import java.util.*;
public class Longest_Consecutive_Sequence {

    public static ArrayList<Integer> longest(int a[])
    {
        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Integer,Boolean> map=new HashMap<>();

        for(int i:a){
            map.put(i,true);
        }

        for(int i:a){
            if(map.containsKey(i-1)){
                map.put(i,false);
            }
        }

        int ml=0,msp=0;

        for(int i:a){
            if(map.containsKey(i)==true){
                int l=1;
                int sp=i;

                while(map.containsKey(sp+l)){
                    l++;
                }

                if(ml<=l){
                    ml=l;
                    msp=sp;
                }

            }
        }

        arr.add(msp);
        arr.add(msp+ml-1);
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
        ArrayList<Integer> ans=longest(a1);
        System.out.print(ans);
    }
    
}
