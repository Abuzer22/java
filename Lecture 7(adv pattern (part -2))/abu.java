// PRINT HOLLOW RECTANGLE PATTERN.
// * * * * * 
// *       *
// * * * * *


public class abu {

    public static void hollow_rectangle(int totrows, int totcols) {
        // outer loop
        for(int i=1; i <= totrows; i++){

            for(int j=1; j <= totcols; j++){
                //cell -(i,j )
                if(i== 1 || i == totrows || j == 1 || j == totcols){
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(4, 5);
        }
}