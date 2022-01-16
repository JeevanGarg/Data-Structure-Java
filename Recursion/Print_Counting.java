import java.util.*;

public class Print_Counting {

    public static void count(int n){
        if(n==0){
            return;
        }
        
        System.out.print(n+" ");
        count(n-1);
        
        
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        count(n);

    }
    
}
