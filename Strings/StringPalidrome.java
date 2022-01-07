import java.util.*;
public class StringPalidrome
 {

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
        String result= reverse(s);
        if(s.equals(result)){
            System.out.println("true");
        }
        else{
            System.out.println("false");

        }
        
        
    }
    
}
