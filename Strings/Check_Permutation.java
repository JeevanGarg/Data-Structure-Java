import java.util.*;
public class Check_Permutation
 {
    
    public static String sort(String s)
    {
        int n=s.length();
        char ch[]=s.toCharArray();

        Arrays.sort(ch);
        String str=new String(ch);
        return str;
    }

  

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String st=sc.next();
        String s1=sort(s);
        String s2=sort(st);
        //System.out.println(s1+" "+s2);
       if(s1.equals(s2)){
           System.out.print("true");
       }
       else{
           System.out.println("false");
       }
        
        
        
    }
    
}
