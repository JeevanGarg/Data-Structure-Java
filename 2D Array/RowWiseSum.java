import java.util.*;

public class RowWiseSum {

    public static int[][] takeInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        int[][] a=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        return a;


    }

    public static void main(String[] args){
        int[][] a=takeInput();
        int r=a.length;
        int c=a[0].length;

        int sum=0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum=sum+a[i][j];
            }
            System.out.print(sum+" ");
            sum=0;
        }
    }
    
}
