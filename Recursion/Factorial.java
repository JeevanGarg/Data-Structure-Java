import java.util.*;

public class Factorial {

    public static int factorial(int n){
        if(n==1){
            return 1;
        }

        int fact=n*factorial(n-1);
        return fact;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=factorial(n);
        System.out.println(ans);

    }
    
}
