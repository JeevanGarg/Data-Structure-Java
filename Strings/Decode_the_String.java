import java.util.*;
public class Decode_the_String
 {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int i,j;
        String d="";
        i=0;

        while(i<n){
            j=i;
            String s1="";
            int freq=0;

            while(j<n && Character.isLowerCase(s.charAt(j)))
            {
                s1=s1+s.charAt(j);
                j++;

            }

            while(j<n && Character.isDigit(s.charAt(j)))
            {
                freq=freq*10+(s.charAt(j)-'0');
                j++;

            }

            while(freq!=0){
                d=d+s1;
                freq--;
            }
            i=j;
        }

        System.out.print(d);
       
  
    }
    
}
