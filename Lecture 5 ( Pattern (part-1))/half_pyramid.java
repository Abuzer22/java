
import java.util.*;


public class half_pyramid {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no : ");
        int n = sc.nextInt();

// // PRINT HALF-PYRAMID PATTERN.

       //for(int line = 1; line <= n; line++){
        //   for(int number = 1; number <= line; number++){
        //             System.out.print( number);
        //         }
        //         System.out.println( );
        //     }
        
// PRINT CHARACTER PATTERN.

        char ch = 'A' ;

        for(int line=1; line<=n;line++){
            for(int chars= 1; chars <= line;chars++){
                System.out.print( " "+ch+" " );
                ch++;
            }
            System.out.println( );
        }

        
        sc.close();
        
    }
    
}
