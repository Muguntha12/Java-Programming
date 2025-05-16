import java.util.*;
class reverse
     {
        public static void main(String[]args)
        {
            Scanner obj=new Scanner(System.in);
            int a=obj.nextInt();
            String str=Integer.toString(a);
            
            StringBuilder sb= new StringBuilder(str);
            sb.reverse();
            int ab=Integer.parseInt(sb.toString());
            System.out.print(ab);
            
            
        }
    
}
