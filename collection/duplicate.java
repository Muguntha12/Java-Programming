import java.util.*;
class duplicate
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        HashSet<Integer> list=new HashSet<>();
        while(true)
        {
            int val=obj.nextInt();
            if(val==-1)
            break;
            list.add(val);
        }
        System.out.print(list);
    
}
}
