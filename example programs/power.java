import java.util.*;
class power
{
  public static void main(String args[])
  {
    Scanner ob=new Scanner(System.in);
    int n=ob.nextInt();
    String[] ar=new String[n];
    for(int i=0;i<n;i++)
    {
      ar[i]=ob.next();
    }
    int a=0;
    for(int i=0;i<n;i++)
    {
      int b=1;
      for(int j=i+1;j<n;j++)
      {
        if((ar[i]).equals(ar[j])) b++;
      }
      a=Math.max(a,b);
    }
    System.out.print(a);
  }
