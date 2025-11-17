// PRINT SQUARE PATTERN.

import java.util.*;

public class PrintSquare {
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // // FOR LOOP.
    //     for (int line =1; line<= 4; line++){
    //         System.out.println(" @ * & $ # @ ");
    //     }

    // // WHILE LOOP.
    //     int line = 1 ;
    //     while(line <= 4){
    //        System.out.println(" * * * * "); 
    //        line++;
    //     }


    // // PRINT REVERSE OF A NUMBER.
        
    //     int n = 10899 ;
        
    //     while(n >0) {
    //         int lastDig = n%10;
    //         System.out.print(lastDig + " ");
    //         n = n/10;
    //     }
    //     System.out.println( );

    // // REVERSER THE GIVEN NUMBER.

    //     int n = 10899;
    //     int rev = 0;

    //     while (n>0){
    //         int lastDigit = n % 10;
    //         rev = (rev * 10 ) + lastDigit;
    //         n = n/10;
    //     }

    //     System.out.println(rev + " ");


    // // DO - WHILE LOOP,

    //     int counter = 1;
    //     do{
    //         System.out.println(counter + ".  HELLO WORLD ! ");
    //         counter++;
    //     }while( counter<=10);

    
    // // BREAK AND CONTINUE IN LOOP. 

    //     for(int i = 1; i<=5; i++ ){
    //         if(i == 3){
    //             break;
    //         }
    //         System.out.println(i);
    //     }
    //     System.out.println(" I am out of the Loop, using break . ");

    // // KEEP ENTERING NUMBERS TILL USER ENTERS A MULTIPLE OF 10.

    //     do{
    //         System.out.println("Enter your Number : ");
    //         int n = sc.nextInt();
    //         if(n % 10 == 0){
    //             break;

    //         }
    //         System.out.println(n + " is yr Number.");
    //     }while(true);


    // // CONTINUE STATEMENT.

    //     for(int i = 1; i<=5; i++ ){
    //         if(i == 3){
    //             continue;
    //         }
    //         System.out.println(i);
    //     }
    //     System.out.println(" I skip 3, using continue statment . ");

    // // DISPLAY ALL NUMBERS ENTERED BY USER EXCEPT MULTIPLES OF 10.

    //     do{
    //         System.out.println("Enter your Number : ");
    //         int n = sc.nextInt();
    //         if(n % 10 == 0){
    //             continue;

    //         }
    //         System.out.println(n + " is yr Number.");
    //     }while(true);


    // CHECK PRIME NUMBER OR NOT.

        System.out.println("Enter Number to check it is prime or not.");
        int n = sc.nextInt();


        if(n==2){
            System.out.println(" n is prime .");
        }else{

            boolean isPrime = true;
            for(int i=2; i<= Math.sqrt(n); i++){
                if(n % i ==0){
                    isPrime = false;
                }
            }
            if (isPrime == true){
                System.out.println("No. is prime . ");
            }else{

                System.out.println("n is not prime .");
            }
        }
         sc.close();



    }

}

