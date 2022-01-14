package Node;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


public class Length_LinkedList {

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

    public static void length(Node<Integer> head)
    {
        int l=0;
        while(head!=null){
            head=head.next;
            l++;
        }
    System.out.println(l);
                     
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Node<Integer> head=takeInput();
        length(head);
    }
    
}


