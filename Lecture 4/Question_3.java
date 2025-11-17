// QUESTION 3 : WRITE A PROGRAM TO FIND THE FACTORIAL OF ANY NUMBER ENTERED BY THE USER.


import java.util.*;

public class Question_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int factorial = 1;

        System.err.println("Enter positve Number to know factorial of Number :  ");
        int n = sc.nextInt();
        
        for( int i = 1; i<=n; i++){
            factorial = factorial * i;
        }
        System.err.println("factorial of Number is : "  + factorial);

        sc.close();
    }

    
}