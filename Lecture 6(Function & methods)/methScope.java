// SCOPE (METHOD SCOPE AND BLOCK SCOPE)

public class methScope {

    public static void main(String[] args) {
    // // MEHTOD SCOPE.
    //     // System.out.println(s); // CAN'T USE BEFORE DECLEARATION.
    //     int s =89;
    //     System.out.println(s);

    // BLOCK SCOPE.

        {
            int s = 89 ;
            System.out.println(s);   
        }
        // System.out.println(s); // CAN'T USE OUTSIDE OF BLOCK.

        for ( int i = 3; i<= 8 ; i++){


        }

        int i = 14;
        System.out.println(i); // OUTPUT = 14 , NOT 3
    }
}