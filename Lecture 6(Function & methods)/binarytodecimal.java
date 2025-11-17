// CONVERT FROM BINARY TO DECIMAL.

public class binarytodecimal {

    public static void bintodec(int binNum){

        int mynum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastdigi = binNum %10;
            decNum = decNum + (lastdigi * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }

        System.out.println("Decimal of " + mynum + " = " +decNum);
    }


    public static void main(String[] args) {
        bintodec(101000);
    }
}
