package Node;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


public class Remove_consecutive_duplicate {

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

    public static Node<Integer> remove(Node<Integer> head)
    {
        Node<Integer> t1=head;
        Node<Integer> t2=head.next;

        while(t2!=null)
        {
            if(t1.data==t2.data){
                t2=t2.next;
            }
            else{
                t1.next=t2;
                t1=t2;
            }

        }
        return head;
                     
    }

    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data);
            head=head.next;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Node<Integer> head=takeInput();
        Node<Integer> newhead=remove(head);
        print(head);
    }
    
}


