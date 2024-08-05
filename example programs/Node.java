import java.util.Scanner;
class node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

    private Node head; 
    private int size; 

    public Stack() {
        this.head = null;
        this.size = 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

   
    public int pop() {
        if (isEmpty()) {
            return -1; 
        }
        int poppedData = head.data;
        head = head.next;
        size--;
        return poppedData;
    }

    
    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

    
    public int size() {
        return size;
    }

   
    public boolean isEmpty() {
        return head == null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); 
        scanner.nextLine(); 
        
        Stack stack = new Stack(); 

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < q; i++) {
            String[] query = scanner.nextLine().split(" ");
            
            switch (query[0]) {
                case "1":
                    int data = Integer.parseInt(query[1]);
                    stack.push(data);
                    break;
                case "2":
                    output.append(stack.pop()).append("\n");
                    break;
                case "3":
                    output.append(stack.top()).append("\n");
                    break;
                case "4":
                    output.append(stack.size()).append("\n");
                    break;
                case "5":
                    output.append(stack.isEmpty() ? "true" : "false").append("\n");
                    break;
                default:
                    break;
            }
        }

        System.out.print(output.toString());

        scanner.close();
    }
}
