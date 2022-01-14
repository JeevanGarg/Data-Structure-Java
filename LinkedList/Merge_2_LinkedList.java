package Node;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


public class Merge_2_LinkedList {

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

    public static Node<Integer> merge(Node<Integer> head1,Node<Integer> head2){
        Node<Integer> head=null,tail=null;
        Node<Integer> t1=head1,t2=head2;
        if(t1.data<=t2.data)
        {
            head=t1;
            tail=t1;
            t1=t1.next;
        }
        else{
            head=t2;
            tail=t2;
            t2=t2.next;
        }

        while(t1!=null && t2!=null){
            if(t1.data<=t2.data){
                tail.next=t1;
                tail=t1;
                t1=t1.next;
            }
            else{
                tail.next=t2;
                tail=t2;
                t2=t2.next;
            }
        }
        
        if(t1!=null){
            tail.next=t1;
        }

        else{
            tail.next=t2;
          
        }

        return head;
    }

    public static void print(Node<Integer> head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Node<Integer> head1=takeInput();
        Node<Integer> head2=takeInput();
        Node<Integer> newhead=merge(head1,head2);
        print(newhead);
    }
    
}


