//hollow rectangle Pattern
import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=cols;j++){
                if(i==1 || j==1|| i==rows|| j==cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}