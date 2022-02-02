// cadeavaga - Replace a with b
import java.util.Scanner;
import java.util.*;

import java.util.*;

public class Replace_with_character {

    public static String replace(String str,char a,char b){
        if(str.length()==0){
            return str;
        }

        String small=replace(str.substring(1), a, b);
        if(str.charAt(0)=='a'){
            return b+small;
        }
        else{
            return str.charAt(0)+small;
        }
    }

    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans=replace(s,'a','b');
        System.out.println(ans);
    }
    
}
