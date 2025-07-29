import java.util.*;
public class Total{
    public static void main(String arg[]){
        double a,dis,gst,m;
        Scanner x=new Scanner(System.in);
        a=x.nextDouble();
        if(a>1000){
            dis=a-a*0.1;
        }else{
            dis= a-a*0.05;
        }
        gst=a*0.18;
        m=a*0.05;
        double total_bill=dis + gst + m;
        System.out.println("total bill  "+total_bill+"\nBILL with discount  "+dis+"\nGST  "+gst+"\nMaintenance charges  "+m);
    }
}