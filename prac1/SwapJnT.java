import java.util.*;
public class SwapJnT{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        int a,b,temp;
        a = x.nextInt();
        b= x.nextInt();
        System.out.println("jerry has "+ a+" apples\n tom has "+b+" apples");
        temp =a;
        a = b;
        b = temp;
        System.out.println("after exchanging:\njerry has "+ a+" apples\n tom has "+b+" apples");

    }
}
