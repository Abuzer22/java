// INVERTED HALF PATTERN WITH NUMBER
// 12345
// 1234
// 123
// 12
// 1



public class inv_numpyramid {
    
    public static void inve_num_pyramid(int n){

        // rows(outer loop)
        for ( int i = 1; i <= n ; i++){

            // inner loop
            for ( int j = 1; j <=n-i+1 ; j++ ){
                System.out.print(j + " ");
            }

            // for( int j =1 ; j<= i-1; j++ ){
            //     System.out.print("* ");
            // }
            System.out.println( );
        }

    }

    public static void main(String[] args) {
        inve_num_pyramid(5);
    }
}
