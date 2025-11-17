import java.util.*;

public class typecnvrs {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        sc.close();
        // TYPE CONVERSION.

        // int a = 25;
        // long b = a;
        // System.out.println(b);
        
        // // TYPE CASTING.

        // float a = 10.5f;   // wrapper class Float (object)
        // int b = (int)a;   // ❌ error: cannot cast Float (object) to int
        // System.out.println(b);

        // // TYPE PROMOTION.

        // char a = 'c';
        // char b = 'd';
        // System.out.println((int)(b));
        // System.out.println((int)(a));
        // System.out.println(b - a);

        // short a = 4;
        // byte b = 45;
        // char c = 'c';
        // byte bt = (byte) (a + b +c);
        // System.out.println(bt);

        // int a = 12;
        // float b = 56.6f;
        // long c = 548645;
        // double ans = 465449.6497;
        // int d = (int) (a + b + c + ans);
        // System.out.println(d);

        // //WRONG.
        // byte a = 5;
        // b = b*2;
        // byte a = b*2;
        
        //RIGHT
        byte b = 5;
        // b = (byte)(b*2);
        //or
        byte a = (byte) (b*2);
        System.out.println(a);



    



        
        
        
        
    }

    
}
