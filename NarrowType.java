import java.util.*;
public class NarrowType{
    public static void main(String arg[]){
        Scanner x= new Scanner(System.in);
        double a;
        int b;
        a=x.nextDouble();
        b = (int)a;
        System.out.println(a);
        System.out.println(b);
    }
}
/*Develop a Java program to demonstrate narrowing type conversion from
 double to int. Accept a double input and cast it to int. Print both values.*/