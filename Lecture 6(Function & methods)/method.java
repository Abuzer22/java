// METHODS (INBUILT VS USER DEFINED).

// import java.util.*;

public class method {

// // FUNCTION OVERLOADING USING PARAMETERS.

//     // func to calc sum of 2 no.
//     public static int sum(int a, int b){
//         return a+b;
//     }

//     // func to calc sum of 3 no.
//     public static int sum(int a, int b, int c ){
//         return a+b+c;

//     }

// FUNCTION OVERLOADING USING DATA TYPES.

    // func add 2 int value.
    public static int sum ( int a , int b){
        return a + b;

    }

    // func add 2 float value.
    public static float sum ( float a , float b) {
        return a + b;

    }

//  CHECK IF A NUMBER IS PRIME OR NOT.

    public static boolean isPrimeNum(int n ){
        for(int i = 2; i<= Math.sqrt(n);i++){
            if (n % i == 0){
                return false;

            }
        }
        return true;
    }
// PRINT ALL PRIME IN A RANGE.

    public static void primerange(int n){
        for(int i =2;i <=n ; i++){
            if(isPrimeNum(i)){
                System.out.print(i+ " ");

            }
        }
        System.out.println();
        

    }
    public static void main(String[] args) {
        // System.out.println(sum(3, 7));
        // System.out.println(sum(3.5f, 6.5f));
        System.err.println(isPrimeNum(2));
        // primerange(30);

    }
}
