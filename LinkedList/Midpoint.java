package Node;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


public class Midpoint {

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

    public static int midpoint(Node<Integer> head)
    {
        Node<Integer> slow=head;
        Node<Integer> fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;      
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Node<Integer> head1=takeInput();
        Node<Integer> head2=takeInput();
        Node<Integer> newhead=merge(head);
    }
    
}


