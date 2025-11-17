import java.util.Scanner;

public class elseif {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // // USE OF ELSE IF.

        // int income = sc.nextInt();
        // int tax ;
        // if(income< 500000){
        //     tax = 0;
        // }
        // else if(income >= 500000 && income <= 1000000){
        //     tax = (int) (income *0.2);

        // }
        // else{
        //     tax = (int) (income * 0.3 );
        // }

        // System.out.println("your tax is " +tax);

    // // QUESTION (PRINT THE LARGEST OF 3)

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // if((a>=b) && (a>=c) ){
        //     System.out.println("A is largest.");
        // }
        // else if (b >= c){
        //     System.out.println( "B is largest.");
        // }
        // else{
        //     System.out.println("C is largest.");
        // }

    // //TERNERY OPERATORS

        // int marks = 56;

        // String reportcard = marks >= 33? "PASS" : "FAIL";
        // System.out.println(reportcard);

    // //SWITCH STATMENT

    //     int number = 'c';
    //     switch (number) {
    //         case 1:
    //             System.out.println("SAMOSA");
    //             break;
    //         case 4:
    //             System.out.println("GHATI");
    //             break;
    //         case 'c':
    //             System.out.println("PAKODA");
    //             break;
        
    //         default: 
    //                 System.out.println("WE WAKE UP");
    //             break;
    //     }

    // CALCULATOR(+,-,*,/,%)

        System.out.println("enter a : ");
        int a = sc.nextInt();
        System.out.println("enter b : ");
        int b = sc. nextInt();
        System.out.println("enter operator : ");
        char operator = sc. next().charAt(0);
        
        switch (operator) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
        
            default:
                System.out.println("CALCULATOR NOT SUPPORT.");
                break;
        }
        




        sc.close();


    }
}

