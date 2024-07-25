import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack_LL {

    Node top;

    Stack_LL() {
        this.top = null;
    }

    public void push(int data) {
        Node newnode = new Node(data);
        if (top == null) {
            top = newnode;
        } else {
            Node temp = top;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void pop() {
        Node temp = top;
        Node prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }

    public int peek() {
        Node temp = top;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Stack_LL s = new Stack_LL();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            s.push(data);
        }
        System.out.println("Stack is : ");
        s.display();
        System.out.println();
        System.out.println("After poping : ");
        s.pop();
        s.display();

        System.out.println();
        System.out.println("Peek element is : ");
        System.out.println(s.peek());

        sc.close();
    }

}