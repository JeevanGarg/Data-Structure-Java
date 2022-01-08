import java.util.*;
public class Remove_Consecutive_Duplicate
 {
    
    public static String remove(String s)
    {
        int n=s.length();
        String str=""+s.charAt(0);
        int k=0;

        for(int i=1;i<n;i++)
        {
            if(s.charAt(i)!=s.charAt(i-1)){
                str=str+s.charAt(i);
            }

        }
        return str;

    }

  

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String str=remove(s);   
        System.out.println(str);    
    }
    
}
