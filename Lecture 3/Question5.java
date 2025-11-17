// QUESTION 5 : WRITE A JAVA PROGRAM THAT TAKES A YEAR FROM THE USER AND PRINT WHETHER THAT YEAR IS A LEAP YEAR OR NOT.

import java.util.*;


public class Question5 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a year, to check its leap or not : ");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        
        boolean y = (year % 100) != 0;

        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if(x && (y || z)){
            System.out.println(year + "is a leap year.");
            
        }else{
            System.out.println(year + "is  not  a leap year.");
            
        }

    }
}
