import java.util.*;
class 2nd_largest
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        
            a[i]=obj.nextInt();
        
        Arrays.sort(a);
          mugunthan(a,n);
          
            
        }
        public static void mugunthan(int[] a,int n)
        {
            List<Integer> set1=new ArrayList<>();
             List<Integer> set2=new ArrayList<>();
              for(int i=0;i<n;i++)
              {
                  if(i%2==0)
                  set1.add(a[i]);
                  else
                   set2.add(a[i]);
              }
              System.out.print(set1.get(set1.size() -2)+set2.get(set2.size() -2));
             
        }
}
        
