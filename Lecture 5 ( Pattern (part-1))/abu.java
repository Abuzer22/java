
import java.util.*;

public class abu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anu No. : ");
        int n = sc. nextInt();
        
    // PRINT STAR PATTERN.
    //  *
    //  *  *
    //  *  * *  (NESTED LOOP)
    //  *  * * *
        
        // for(int line =1; line<=n;line++){
        //     for(int star = 1;star<=line;star++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println( );
        // }
        
    
    // PRINT  INVERTED - STAR PATTERN.
    //  *  * * *
    //  *  * *  (NESTED LOOP)
    //  *  *
    //  *

        for(int line =1; line<=n;line++){
            for(int star = 1;star<= (n- line  + 1);star++){
                System.out.print(star);
                System.out.print(" * ");
            }
            System.out.println( );
        }

        sc.close();
    }
}