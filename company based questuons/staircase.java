import java.util.*;
class staircase
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
         int j =0;
         int h=0;
        int ways=1;
        if(n<20)
        {
        for(int i=0;i<n;i++)
        {
             j=ways;
             ways=h+ways;
             h=j;
             
        }
        System.out.print(ways);
        }
       else
        {
            System.out.print("not");
        }
    }
}
