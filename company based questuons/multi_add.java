import java.util.*;

class multi_add {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       int n=obj.nextInt();
       int count=0;
       int l=obj.nextInt();
       for(int i=1;i<=l;i++)
       {
           int c=i*n;
           count=count+c;
       
           System.out.println(i+" *"+n+"="+i*n);
            
           
       } System.out.println("total is"+count);
    }
}
