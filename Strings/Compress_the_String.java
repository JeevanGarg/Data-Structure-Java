import java.util.*;
public class Compress_the_String
 {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        String s1=""+s.charAt(0);
        int k=0;
        int count=1;
       
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                count++;
            }
            else
            {
                 if(count>1)
                 {
                    s1=s1+count;
                 }
                 
                 s1=s1+s.charAt(i);
                 count=1;

            }

        }
        if(count>1)
        {
            s1=s1+count;
        }

        System.out.println(s1);
=
    }
    
}
