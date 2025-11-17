// CONDITIONAL STATEMENTS QUESTIONS.
//  Question1:Write a Javaprogram to get a number from the user and print whether it is positive or negative.

import java.util.*;

public class Question1 {

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        if(number>=0){
            System.out.println("Number is Positive. ");
            
        }
        else{
            System.out.println("Number is Negative. ");

        }

        sc.close();
    }
    
}
