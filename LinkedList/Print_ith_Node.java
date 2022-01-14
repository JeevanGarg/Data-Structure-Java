package Node;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


public class Print_ith_Node {

    public static Node<Integer> takeInput(){

        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        Node<Integer> head=null,tail=null;
        while(data!=-1)
        {
            Node<Integer> temp=new Node<Integer>(data);
            if(head==null){
                head=temp;
                tail=temp;
            }

            else{
                tail.next=temp;
                tail=temp;
            }

            data=sc.nextInt();

        }
        
        return head;
    }   

    public static void print(Node<Integer> head,int n)
    {
        for(int i=0;i<n && head!=null;i++)
        {
            head=head.next;
        }
        System.out.println(head.data);
        
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Node<Integer> head=takeInput();
        System.out.print("Enter the ith Node to be print");
        int n=sc.nextInt();
        print(head,n);
    }
    
}


