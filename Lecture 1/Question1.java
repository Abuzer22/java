/*Question1:Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N) */

import java.util.*;

public class Question1 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int Average = ( a + b + c)/3;
        System.out.println("The Average of Numbers is : " + Average);

        sc.close();

    }
    
}
