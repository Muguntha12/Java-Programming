import java.util.Scanner;
class ajay implements Runnable
{
	public void run()
	{
		try {
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			int a=0;
			Thread.sleep(1100);
			for(int i=1;i<=num;i++)
			{
				if(i%2!=0)
				{
					a=i*i-1;
				    System.out.print(a+" ");
				}
				else {
					a=i*i-2;
					System.out.print(a+" ");
					}
			}}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
public class nums {
   public static void main(String[] args) 
   {
		Runnable ms=new ajay();
		Thread d=new Thread(ms);
		d.start();
	}
}
