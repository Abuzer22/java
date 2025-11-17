// FUNCTIONS AND METHOD.

import java.util.*;

class abu {

// FUNCTION WITHOUT PARAMETERS.
public static void HW(){
    System.out.println("HELLO WORLD");
    System.out.println("HELLO WORLD");
    System.out.println("HELLO WORLD");
    return ;
}

// FUNCTION WITH PARAMETERS.
    public static int CalSum(int a , int b) { // PARAMENTERS AND FORMAL PARAMETERS.
            
            int sum = a + b;
            return sum;
            
            
            
        }
        
        public static void main(String[] args) { // this is main function with void returntype.
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. 1st : ");
            int num1 = sc.nextInt();
            HW();
            System.out.println("Enter no. 2nd : ");
            int num2 = sc.nextInt();
            int sum = CalSum(num1, num2); // ARGUMENTS AND ACTUAL PARAMETERS.
            System.out.println(" Sum is : "+sum);
            
            
            sc.close();

        }
}