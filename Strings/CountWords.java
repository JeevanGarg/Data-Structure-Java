import java.util.*;
public class CountWords {

    public static int countword(String str){
        int count=0;
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)==' '){
                count++;
            }

        }
        return count+1;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int result= countword(s);
        System.out.println(result);
        
    }
    
}
