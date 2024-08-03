import java.util.Scanner;
class duplicate
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int arr[] = new int[size];
        int i =0;int sum=0;int j=0;int b=0;
        for(i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
        }
        try
        {
            for(i=0;i<size;i++)
            {
                for(j=i+1;j<size;j++)
                {
                    if(arr[i]==arr[j])
                    {
                    b=arr[i];
                    sum=sum+1;
                    sum=sum/0;
                    }
                }
            }
            if(sum==0)
            {
            System.out.println("Duplicates not found");
            }
        }
        catch(Exception e)
        {
            System.out.print("Duplicates found: "+b);}
    }
}