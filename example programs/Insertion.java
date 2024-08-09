import java.util.Scanner;
public class Insertion{
    Node head ;
    Node tail;
    class Node{
        int data ;
        Node next;
        Node prev;
        Node(int val)
        {
            data =val;
            next = null;
            prev=null;
        }
    }
    Insertion()
    {
        head = null;
        tail = null;
    }
    public void insertbegin(int val1)
    {
        Node newnode = new Node(val1);
        if(head==null){
            head= newnode;
        }
        else{
            Node temp = head;
            newnode.next = temp;
            temp.prev = newnode;
        }
        head = newnode;
    }
    public void insertend(int val)
    {
        Node newnode  = new Node(val);
        if(head==null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    public void insertpos(int pos,int val2 ){
        Node newnode = new Node(val2);
        Node temp = head;
        for(int i= 1;i<pos;i++){
            temp = temp.next;
        }
        newnode.next=temp.next;
        temp.next.prev = newnode;
        newnode.prev = temp;
        temp.next = newnode;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        Insertion list = new Insertion();
        int n = obj.nextInt();
        for(int i =0;i<n;i++)
        {
            int val=obj.nextInt();
            list.insertbegin(val);
        }
        list.display();
        int a1 = obj.nextInt();
        list.insertend(a1);
        list.display();
        int a2 = obj.nextInt();
        int a3 = obj.nextInt();
        list.insertpos(a2,a3);
        list.display();
}
}
