package Node;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


public class Reverse_LinkedList {

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
    
    public static Node<Integer> reverse(Node<Integer> head)
    {
        Node<Integer> prev=head;
        Node<Integer> curr=head.next;

        while(curr!=null){
            Node<Integer> next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;
        return head;

    }
   

    public static void print(Node<Integer> head)
    {
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Node<Integer> head=takeInput();
        Node<Integer> newhead=reverse(head);
        print(newhead);
    }
    
}


