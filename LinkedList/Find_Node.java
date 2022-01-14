package Node;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


public class Find_Node {

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

    public static int findNode(Node<Integer> head,int n)
    {
        int count=0;
        while(head!=null){
            if(head.data==n){
                
                return count;
            }
            count++;
            head=head.next;
        }
        return -1;
        
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Node<Integer> head=takeInput();
        System.out.print("Enter the element to find");
        int n=sc.nextInt();
        int ans=findNode(head,n);
        System.out.println(ans);
    }
    
}


