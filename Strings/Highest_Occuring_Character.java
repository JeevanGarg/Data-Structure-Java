import java.util.*;
public class Highest_Occuring_Character
 {
    //Method-1
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Character,Integer> map=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int n=s.length();
        int max=Integer.MIN_VALUE;
        Character c='\0';

        for(int i=0;i<n;i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                int val=map.get(s.charAt(i));
                val++;
                map.put(s.charAt(i), val);
                
            }
            else
            { 
                map.put(s.charAt(i),1);

            }
            
        }

        Set<Character> keys=map.keySet();

        for(Character ch:keys){
            if(max<map.get(ch)){
                max=map.get(ch);
                c=ch;
            }
        }

        System.out.println(c);

        //--------------------------------------

        




        
    }
    
}
