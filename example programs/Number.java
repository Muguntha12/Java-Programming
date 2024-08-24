import java.util.Scanner;

class Number
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int size= obj.nextInt();
        int[] arr=new int[size];
        int itr;
        for(itr=0;itr<size;itr+=1)
            arr[itr]=obj.nextInt();
        int[] res=new int[size];
        int j,multi=1;
        for(j=0;j<size;j+=1)
        {
            multi=1;
            for(itr=0;itr<size;itr+=1)
            {
                if(j!=itr)
                multi *= arr[itr];
            }
            res[j]=multi;
        }
        for(int ele : res)
            System.out.print(ele+" ");
    }
}
