import java.util.*;

public class Count_NoOf_ways_NthStair {

    public static int count(int n)
    {
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int ans=count(n-1)+count(n-2);
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=count(n);
        System.out.print(ans);
        

    }
    
}
