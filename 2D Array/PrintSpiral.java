import java.util.*;

public class PrintSpiral {

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
        int count=0;
        int total=r*c;
        int rstart=0,cstart=0,rend=r-1,cend=c-1;

        
        while(count<total)
        {
            for(int i=cstart;i<=cend;i++){
                System.out.print(a[rstart][i]+" ");
                count++;
            }
            rstart++;

            for(int i=rstart;i<=rend;i++){
                System.out.print(a[i][cend]+" ");
                count++;
            }
            cend--;

            for(int i=cend;i>=cstart;i--){
                System.out.print(a[rend][i]+" ");
                count++;
            }
            rend--;

            for(int i=rend;i>=rstart;i--){
                System.out.print(a[i][cstart]+" ");
                count++;
            }
            cstart++;

        }

       
       
    }
    
}
