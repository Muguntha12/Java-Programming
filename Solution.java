import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int c=0;
        int temp = a;
        int last = 0;
        int length=  String.valueOf(a).length();
        for(int i =0;i < length;i++)
        {
            last = temp % 10;
            if(last == 0)
            {
                c++;
            }
            temp = temp/10;
}
        System.out.printf("%d",c);
        }
}

      
