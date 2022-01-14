package Node;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


public class AppendLastNToFirst {

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

    public static int length(Node<Integer> head){
        int l=0;
        while(head!=null){
            head=head.next;
            l++;
        }
        return l;
    }

    public static Node<Integer> append(Node<Integer> head,int n){
        int l=length(head);
        int s=l-n;
        int i=0;
        Node<Integer> temp=head;
        Node<Integer> newhead=null;

        while(i<s-1){
            temp=temp.next;
            i++;
        }
        newhead=temp.next;
        temp.next=null;
        Node<Integer> tail=newhead;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=head;
        return newhead;
        
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
        System.out.print("Enter the node from where to append");
        int n=sc.nextInt();
        Node<Integer> newhead=append(head,n);
        print(newhead);
    }
    
}


