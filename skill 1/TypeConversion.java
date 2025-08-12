import java.util.*;
//Develop a Java program to demonstrate widening type conversion
// from int → long → float. Show that no data is lost.
public class TypeConversion{
    public static void main(String arg[]){
        int a;
        long b;
        float c;
        Scanner x= new Scanner(System.in);
        a=x.nextInt();
        b = (long)a;
        c= (float)a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        }
}