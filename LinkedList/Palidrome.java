package Node;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


public class Palidrome {

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
    

    public static Node<Integer> middle(Node<Integer> head){
        Node<Integer> slow=head;
        Node<Integer> fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static Node<Integer> reverse(Node<Integer> head){
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
   
    public static boolean palidrome(Node<Integer> head){

        if(head==null){
            return true;
        }
        Node<Integer> mid= middle(head);
        Node<Integer> last=reverse(mid.next);
        Node<Integer> curr=head;

        while(last!=null){
            if(last.data!=curr.data)
            {
                return false;

            }
            last=last.next;
            curr=curr.next;
        }
        return true;
    }

   

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Node<Integer> head=takeInput();
        boolean b=palidrome(head);
        System.out.println(b);
    }
    
}


