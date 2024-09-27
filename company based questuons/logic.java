import java.util.*;
class logic{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a=1;
        while(a<=n)
        {
            a=a*(2);
        }
       a=a/2;
       int res=(n-a)*2+1;
       System.out.print(res);
}
}