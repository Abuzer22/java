// QUESTION 4 : WRITE A PROGRAM TO PRINT MULTIPLICATION TABLE OF A NUMBER N, ENTERED BY THE USER.

import java.util.*;



// public class Question_4 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int table = 1;

//         System.out.println("Enter no. to print Table : ");
//         int n = sc.nextInt();

//         System.out.println("Table of the Number is : ");
//         for(int i = 1 ; i<=10; i++){
            
//             System.out.println( n + " x " + i + " = " + table);
//         }

//         sc.close();
        
//     }
    
// }

// printQuestion_4 methos is unused, as the method takes input directly form user.

class Question_4 {

    public static void printQuestion_4(int Number) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. : ");
        int n = sc.nextInt();
        for(int i = 1; i<=10;i++){
            System.out.println(n + "X" + i + "=" + n*i);
        }
        sc.close();
    }
        
        
    

    public static void main(String s[]){
        printQuestion_4(5);
    }
}