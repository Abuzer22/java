// Question2:Write a program that reads a set of integers,and then prints the sum of the even and odd integers.

import java.util.*;

public class Question2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        int evensum = 0;
        int oddsum = 0;


        do {
            System.out.println("Enter the number : ");
            int number = sc.nextInt();
            
            if( number % 2 == 0){
                evensum += number;
            }else{
                oddsum += number;
            }

            System.out.println("Do u want to continue? Press 00 for yes or 10 for No. ");
            
            choice = sc. nextInt();


        }while(choice == 00 );

        System.out.println("Sum of even no. : " + evensum);
        System.out.println(" Sum of odd no. : " + oddsum);

        sc.close();

        
    }
}
