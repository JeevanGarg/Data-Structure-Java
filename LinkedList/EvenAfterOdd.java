package Node;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


public class EvenAfterNode {

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
    
    public static Node<Integer> oddeven(Node<Integer> head)
    {
        Node<Integer> eh=null,et=null,oh=null,ot=null;

        while(head!=null){
            if(head.data%2==0)
            {
                if(eh==null && et==null){
                    eh=head;
                    et=head;
                }
                else{
                    et.next=head;
                    et=head;
                }
                head=head.next;

            }
            else{
                if(oh==null && ot==null){
                    oh=head;
                    ot=head;
                }
                else{
                    ot.next=head;
                    ot=head;
                }
                head=head.next;
            }
        }

        if(oh!=null){
            ot.next=eh;
        }
        else{
            return eh;
        }
        if(eh!=null){
            et.next=null;
        }
            return oh;
        


    }

    public static void print(Node<Integer> newhead)
    {
        while(newhead!=null){
            System.out.print(newhead.data+" ");
            newhead=newhead.next;       
        }

    }
   

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Node<Integer> head=takeInput();
        Node<Integer> newhead=oddeven(head);
        print(newhead);
    }
    
}


