// Question 2:Write a method named isEven that accepts an int argument.The method should return true if the argument iseven, or false otherwise.Also write a program to test your method.

import java.util.*;

public class Question_2 {

    public static boolean isEvan(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int num;
             System.out.println("Enter a Number to check it is even or not : ");
             num = sc.nextInt();
             if(isEvan(num)){
                System.out.println("Number is Even");
             }else{
                System.out.println("Number is Odd.");
             }
            // System.out.println("Answer is : "+isEvan(num));
            
            sc.close();
        }
}
