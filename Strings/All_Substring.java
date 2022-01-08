import java.util.*;
public class All_Substring
 {

    public static void substring(String str){
      int n=str.length();

      for(int i=0;i<n;i++){
          for(int j=i;j<n;j++){
              System.out.println(str.substring(i,j+1));
          }
      }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        substring(s);
        
        
        
    }
    
}
