// QUESTION 3 : WRITE A JAVA PROGRAM TO INPUT WEEK NUMBER(1-7) AND PRINT DAY OF WEEK NAME USING SWICH CASE.

import java.util.*;

public class Question3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days :  ");
        int dayno = sc.nextInt();
        switch (dayno) {
            case 1 :
                System.out.println("MONDAY");
                
                break;
            case 2 :
                System.out.println("TUESDAY");
                
                break;
            case 3 :
                System.out.println("WEDNESDAY");
                
                break;
            case 4 :
                System.out.println("THURSDAY");
                
                break;
            case 5 :
                System.out.println("FRIDAY");
                
                break;
            case 6 :
                System.out.println("SATURDAY");
                
                break;
            case 7 :
                System.out.println("SUNDAY");
                
                break;
                
                default:
                System.out.println("INVALID INPUT! PLEASE ENTER NUMBER BETWEEN 1 TO 7.");
                break;
        }

        sc.close();
        
    }
    
}
