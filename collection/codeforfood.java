import java.util.*;
class codeforfood
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        HashMap<Integer,String> list=new HashMap<>();
        String str;
        int val;
        
        while(true)
        {
        
        val=obj.nextInt();
         
    
            if(val==-1)break;
            str=obj.next();
        list.put(val,str);
        }
            
              System.out.print("enter a number");
             int a=obj.nextInt();
              System.out.print(list);
            
             String data=list.get(a);
             System.out.print(data);
       
    }

}
