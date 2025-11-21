
// Question 1 :Write a Java method to compute the average of three numbers..

import java.util.*;

class Question1 {
    
    public static double find_avg(double a, double b, double c ){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter First Number : ");
        double a = sc.nextDouble();
        System.out.println(" Enter Second Number : ");
        double b = sc.nextDouble();
        System.out.println(" Enter Third Number : ");
        double c = sc.nextDouble();
        System.out.println("Average of Three Numbers is : "+ find_avg(a, b, c)+ "\n");

        sc.close();
    }

}
