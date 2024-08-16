import java.util.*;
interface rectangle
{
    int data(int l,int b);
    
}
interface square
{
    int data(int s );
    
}
interface triangle
{
    int data(int b1,int h);
    
}
interface circule
{
    double data(int r1);
    
}
class shapes_of_area
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        rectangle r=(l,b)->{
            return l*b;
            
        };
        square s=(s1)->{
            return s1*s1;
            
        };
         triangle t=(b1,h)->{
            return (b1*h)/2;
            
        };
        circule c=(r1)->{
            return (3.14*r1*r1);
            
        };
         System.out.print("enter l and b");
        int l=obj.nextInt();
         int b=obj.nextInt();
        System.out.print("the rectangle area is"+r.data(l,b));
         System.out.println();
        System.out.print("enter s");
        int s1=obj.nextInt();
        
        System.out.print("the squre area is"+s.data(s1));
          System.out.println();
        System.out.print("enter b1 and h");
        int b1=obj.nextInt();
         int h=obj.nextInt();
        System.out.print("the triangle area is"+t.data(h,b1));
          System.out.println();
        System.out.print("enter r1");
        int r1=obj.nextInt();
         
        System.out.print("the circule area is"+c.data(r1));
          System.out.println();
        }
    }
