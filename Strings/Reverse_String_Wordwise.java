import java.util.*;
public class Reverse_String_Wordwise
 {
     public static String reverse(String s){
         String str="";
         int n=s.length();
         for(int i=n-1;i>=0;i--)
         {
             str=str+s.charAt(i);
         }

         return str;
     }

    public static void word(String str)
    {   int n=str.length();
        String s=reverse(str);
        String st="";

        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==' ')
            {
                String result=reverse(st);
                System.out.print(result+" ");
                st="";

            }
            else
            {
                st=st+s.charAt(i);
            }
        }
        System.out.print(reverse(st));

      
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        word(s);     
    }
    
}
