package JAVA;
import java.util.*;
class Treeset {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println(list);
        System.out.println("``````````````````````````````");
        int num;
        while(true){
            num=sc.nextInt();
            if(num==-1)
            break;
            list.add(num);
        }
        	System.out.print(list);
        	TreeSet<Integer> set=new TreeSet<>(list);
        	System.out.print(set);
    }
}
