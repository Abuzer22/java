// CONVERT FROM DECIMAL TO BINARY.

public class dectobin {

    public static void dectobine (int decNum ){
       int mydec = decNum;
       int pow = 0;
       int binNum = 0;
       
       while (decNum >0) {

        int rem = decNum % 2;

        binNum = binNum + (rem * (int)Math.pow(10, pow));
        pow++;
        decNum = decNum/2;
       }
       System.out.println("Binary of " + mydec + " = " +binNum );
    }

    public static void main(String[] args) {
        dectobine(15);
    }
}
