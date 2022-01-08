import java.util.*;
public class Remove_Character
 {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ch=sc.next().charAt(0);
        int n=s.length();
        String str="";

        for(int i=0;i<n;i++){
            if(s.charAt(i)==ch){
                continue;
            }
            str=str+s.charAt(i);
        }
        
        System.out.println(str);
    }
    
}
