import java.util.Scanner;

interface average_
{
    double average(int[] numbers);
}
class avgnumber
{
    public static void main(String[]args){

    Scanner obj=new Scanner(System.in);
    int[] arr=new int[5];
    
    for(int i=0; i<5; i++){
        arr[i] = obj.nextInt();
    }
    
    average_ avg = (int[] numbers) -> {
        double avgr = 0;
        for(int i=0; i<5; i++){
            avgr += numbers[i];
        }
        
        return avgr/5;
    };
    
    System.out.print(avg.average(arr));
    }
}