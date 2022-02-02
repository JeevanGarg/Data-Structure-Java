// 412-  four one two

import java.util.Scanner;
import java.util.*;

import java.util.*;

public class NumberOfDigits {

    public static int digit(int n){
        if(n==0){
            return 0;
        }

        int ans=digit(n/10);
        return 1+ans;
        
    }

    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans = digit(n);
        System.out.println(ans);
    }
    
}
