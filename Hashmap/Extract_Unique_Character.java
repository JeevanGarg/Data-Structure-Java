import java.util.*;
public class Extract_Unique_Character {

    public static String unique(String s){
    
        HashMap<Character,Integer> map=new HashMap<>();
        String str="";

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                   continue;
            }
            str=str+s.charAt(i);
            map.put(s.charAt(i),1);

        }

       return str;

    }

    // public static int[] takeInput(){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter Input");
    //     int n=sc.nextInt();
    //     int a1[]=new int[n];
        
    //     for(int i=0;i<n;i++){
    //         a1[i]=sc.nextInt();
    //     }
    //     return a1;
    // }

    public static void main(String[] args){

        //int[] a1=takeInput();
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans=unique(s);
        System.out.print(ans);
    }
    
}
