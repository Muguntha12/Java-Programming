import java.util.*;

class series{

public static void main(String[] args){

Scanner obj=new Scanner(System.in);

int n=obj.nextInt();

int P2=0;

int P3=0;

for(int i=0;i<n;i++){

if(i%2==0){

System.out.print((int)Math.pow(2,P2)+" "); P2++;

}

else{ System.out.print((int) Math.pow(3,P3)+" "); P3++; }

}

}
}
