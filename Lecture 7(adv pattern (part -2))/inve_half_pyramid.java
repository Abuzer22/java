// // INVERTED AND ROTATED HALF PYRAMID
//       *
//     * *
//   * * * 


public class inve_half_pyramid {

    public static void  half_pyramid(int n) {
        
        // rows (outer loop)
        for(int i =1 ; i <= n;i++ ){
            // spces
            for(int j =1 ; j<= n-i ; j++){
                System.out.print("   ");
            }
    
            // stars
           for(int j=1; j <= i; j++){
                 System.out.print(" * ");
           }
    
           System.out.println( );
    
        }

    }
    
    public static void main(String[] args) {
        half_pyramid(5);
    }

    
    
}