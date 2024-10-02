import java.util.*;
class numberlogic
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int sum=0;
        int total;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
          a[i]=obj.nextInt();
         
        }
          Arrays.sort(a);
          for(int c:a)
          System.out.print(c+" ");
         for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                total=Math.abs(a[i]-a[i+1]);
                sum=sum+total;
            }
            else if(i==n-1)
            {
                 total=Math.abs(a[i]-a[i-1]);
                sum=sum+total;
                
            }
            else
            {
                if(a[i-1]>a[i+1])
                {
                     total=Math.abs(a[i]-a[i-1]);
                sum=sum+total;
                   
                }
                else
                {
                     total=Math.abs(a[i]-a[i+1]);
                sum=sum+total;
                  
                }
            }
        
       
      
        }
        System.out.println();
          System.out.println(sum);
       
    }
}
