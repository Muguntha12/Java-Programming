import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String str =  obj.nextLine();
        int i =0;
        char a;
        int sum=0;
        int n = str.length();
        try
        {
            for(i=0;i<n;i++)
            {
            a =str.charAt(i);
            if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
            {
              sum = sum+1;
              sum=sum-2;
            }}
            if(sum==0)
            {
                System.out.println("String  does not contains Vowels");
            }
        }
            catch(Exception e)
            {
                System.out.println("String contain Vowels ");
            }
        }
}