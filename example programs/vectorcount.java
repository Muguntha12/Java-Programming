import java.util.*;
class vectorcount


{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        Vector<Integer> list=new Vector<>();
        int count=0;
        while(true)
        {
        int val=obj.nextInt();
        if(val==-1)
        {
            break;
        }
        list.add(val);
        count++;
        }
        System.out.print(list);
        list.add(4,5);
        System.out.print(list);
        System.out.println();
        System.out.println(count);
        
  }
}
