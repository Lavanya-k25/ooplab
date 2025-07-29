import java.lang.*;
import java.util.*;
public class SqRoot{
    public static void main(String arg[]){
        int i,n;
        double a;
        Scanner x= new Scanner(System.in);
        n = x.nextInt();
        for(i=0;i<=n;i++){
            a=Math.sqrt(i);
            System.out.println(a);
        }
    }
}