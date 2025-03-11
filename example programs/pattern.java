import java.util.*;
class pattern
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next();
        String b=obj.next();
        for(int i=0;i<=a.length()-b.length();i++)
        {
           
                if(a.substring(i,i+b.length()).equals(b))
                {
                    System.out.println("Pattern found at index "+i);
                }
            
        }
    }
}
