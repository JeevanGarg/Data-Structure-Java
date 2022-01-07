import java.util.*;
public class ReverseString {

    public static String reverse(String str){
        String s="";
        int n=str.length();
        for(int i=n-1;i>=0;i--)
        {
            s=s+str.charAt(i);

        }
        return s;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String result=reverse(s);
        System.out.println(result);
        
    }
    
}
