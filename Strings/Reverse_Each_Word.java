import java.util.*;
public class Reverse_Each_Word
 {
    
    public static String reverse(String s)
    {
        int n=s.length();
        String str="";

        for(int i=n-1;i>=0;i--)
        {
            str=str+s.charAt(i);

        }
        return str;

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        String str="";
        
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                String st=reverse(str);
                System.out.print(st+" ");
                str="";
            }
            else{
                str=str+s.charAt(i);
            }
        }
        System.out.print(reverse(str));
    }
    
}
