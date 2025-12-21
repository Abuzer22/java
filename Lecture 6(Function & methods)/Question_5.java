/*
 Write a Java method to compute the sum of the digits in an integer.

Hint : Approach this question in the following way :
a. Take a variable sum = 0
b. Find the last digit of the number
c. Add it to the sum
d. Repeat a & b until the number becomes 0.
*/


import java.util.*;

public class Question_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an Integer to know sum of digit : ");
        int digits = sc.nextInt();
        System.out.println("The Sum is : " +sumofdigit(digits));
        sc.close();
    }

    public static int sumofdigit(int n){

    int sumofdigi = 0;

    while(n>0){
        int lastdigi = n%10;
        sumofdigi += lastdigi;
        n /= 10;
    }

    return sumofdigi;

    }
    
}
