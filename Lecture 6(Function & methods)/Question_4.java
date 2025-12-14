/*READ&CODEEXERCISESearch about(Google) & use the following methods of the Math class in Java:
a.Math.min( )
b.Math.max( )
c.Math.sqrt( )
d.Math.pow( )
e.Math.avg( )
f.Math.abs( ) */

import java.util.*;

public class Question_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            // Input two numbers 
            System.out.println("Enter first Number : ");
            double num1 = sc.nextDouble();

            System.out.println("Enter second Number : ");
            double num2 = sc.nextDouble();

            // Math.min()
            double minVal = Math.min(num1, num2);
            System.out.println("Minimum Value : " + minVal);

            // Math.max()
            double maxVal = Math.max(num1, num2);
            System.out.println("Maximum Value : " + maxVal);

            // Math.sqrt()
            if(num1 >= 0) {
                System.out.println("Square Root of the first Numbr : " +Math.sqrt(num1));
            } else if(num2 >= 0){
                System.out.println("Square Root of the second Number : " +Math.sqrt(num2));
            } else {
                System.out.println(" Square Root of first number is not real (negative number).");
            }

            // Math.pow() -- num1 raised to num2
            System.out.println(num1 + " raised to the power " +num2+ " : " +Math.pow(num1, num2));

            System.out.println("Averate of Numbers : " +((num1 + num2)/2));

            System.out.println("Absolute value of first number : " +Math.abs(num1));


        }catch (Exception e){
            System.out.println("Invalid input. Please enter numeric values.");
                
        } finally{
            sc.close();
        }
    }


    
}
