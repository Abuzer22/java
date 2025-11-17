// CALL BY VALUE(when copy of value pass in function) , AND 
//CALL BY REFERENCE(when actual value pass in function).

public class call_by {

    public static void swap (int a , int b){
         // swap 
        int temp = a;
        a = b;
        b = temp;

    } 
    
    public static void main(String[] args) {
        // SWAP - values exchange.
        int a = 5;
        int b = 8;
        swap(a, b); // CALL BY VALUE(copy of a is go to swap function. not actual)
        System.out.println("a value is : " +a);
        System.out.println("b value is : " +b);


    }
    
}
