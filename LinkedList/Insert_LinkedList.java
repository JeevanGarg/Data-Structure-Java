package Node;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


public class Insert_LinkedList {

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

    public static Node<Integer> insert(Node<Integer> head,int elem,int pos)
    {
        Node<Integer> temp=new Node<>(elem);
        Node<Integer> prev=head;
        if(pos==0)
        {
            temp.next=head;
            head=temp;
        }
        else{
            for(int i=0;i<pos-1 && prev!=null;i++){
                prev=prev.next;
            }
            if(prev!=null){
                temp.next=prev.next;
                prev.next=temp;
            }
        }
        return head;
    }

    public static void print(Node<Integer> head){

        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Node<Integer> head=takeInput();
        System.out.print("Enter the element and position to be inserted");
        int elem=sc.nextInt();
        int pos=sc.nextInt();
        Node<Integer> newhead=insert(head,elem,pos);
        print(newhead);
    }
        
    
}


