import java.util.*;

public class PrintWave {

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

        int rmax=0,cmax=0,rindex=0,cindex=0,sum=0;

        for(int i=0;i<c;i++){
            if(i%2==0){
                for(int j=0;j<r;j++){
                    System.out.print(a[j][i]+" ");
                }
            }

            else{
                for(int j=r-1;j>=0;j--){
                    System.out.print(a[j][i]+" ");
                }
            }
        }
       
    }
    
}
