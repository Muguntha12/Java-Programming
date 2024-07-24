import java.util.Scanner;
class linlis
{
  Node head;
  Node tail;
  
  class Node
  {
   int data;
   Node next;
   Node prev;
   
   Node(int val)
   {
     data = val;
     next = null;
     prev = null; 
   }
  }
  linlis()
  {
   head = null;
   tail = null; 
  }
  public void insertbeg(int val)
  {
   Node newnode = new Node(val);
   if(head == null)
   {
    tail = newnode; 
   } 
   else
   {
    newnode.next = head;
    head.prev = newnode; 
   }
   head = newnode;
  }
  public void insertend(int val2)
  {
   Node newnode = new Node(val2);
   if(tail == null)
   {
    tail = newnode; 
   } 
   else
   {
    newnode.prev = tail; 
    tail.next = newnode;
   }
   tail = newnode;
  }
  public void insertpos(int pos,int d)
  {
   Node newnode = new Node(d);
   Node temp = head;
   for(int i = 1; i<pos ;i++)
   {
    temp = temp.next; 
   } 
   newnode.next = temp.next;
   temp.next.prev = newnode;
   temp.next = newnode;
   newnode.prev = temp;
  }
  public void dis()
  {
   Node temp = head;
   while(temp!=null)
   {
    System.out.print(temp.data+"-->");
    temp = temp.next; 
   } 
   System.out.print("null");
  }
  public static void main(String args[])
  {
   Scanner ob = new Scanner(System.in);
   linlis list = new linlis();
   System.out.println("Enter the no of nodes to insert:");
   int n = ob.nextInt();
   for(int i=0;i<n;i++)
   {
    int val = ob.nextInt();
    list.insertbeg(val); 
   }
   for(int i=0;i<n;i++)
   {
    int val2 = ob.nextInt();
    list.insertend(val2); 
   }
   System.out.println("Enter the position and the data to insert at the position: ");
   int pos = ob.nextInt();
   int d = ob.nextInt();
   list.insertpos(pos, d);
   list.dis();
   ob.close();
  }
}