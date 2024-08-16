import java.util.*;
interface rectangle
{
    int data(int l,int b);
    
}
class main
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        rectangle ans=(l,b)->{
            return l*b;
            
        };
        int l=obj.nextInt();
         int b=obj.nextInt();
        System.out.print("the rectangle area is"+ans.data(l,b));
        }
    }
