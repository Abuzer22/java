// HOLLOW RECTANGLE PATTERN 
/*   * * * * * 
 *   *       *
 *   * * * * *  
 */


public class Question_1 {
    
    public static void main(String[] args) {

// METHOD NUMBER 1.
    
        // for(int i =1 ; i<=4;i++){
        //     if(i== 1|| i == 4){
        //         System.out.println(" * * * * * ");
        //     }else{
        //         System.out.println(" *       * ");
        //     }
        // }

// METHOD NUMBER 2.
    
        // System.out.println(" * * * \n *   * \n * * * ");

// METHOD NUMBER 3.

        int rows =  4, cols = 5;
        for(int line =1; line<=rows; line++){
            for(int star =1 ; star <= cols; star++){
                if(line == 1 || line == rows || star == 1 || star == cols){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }

            }
            System.out.println( );
            
        }




    }
}

