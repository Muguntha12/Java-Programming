import java.util.*;
class reverse
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        Set<Integer> list=new TreeSet<>(Collections.reverseOrder());
      
        int val;
        
        while(true)
        {
        
        val=obj.nextInt();
         
    
            if(val==-1)break;
          
        list.add(val);
        }
             System.out.print(list);
       
    }

}
