import java.util.*;
class first_single_element
{
   public static void main (String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        int c=0;
        char arr[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        
        {
            String re=str.substring(i+1,str.length());
            String be=str.substring(0,i);
            if(re.indexOf(arr[i])==-1&&be.indexOf(arr[i])==-1)
            {
                System.out.print(arr[i]);
                c++;
                break;
                
            }
            else 
            {
                continue;
            }
        
            
        }
        if(c==0)
        {
            System.out.print("-1");
        }
    }
}
