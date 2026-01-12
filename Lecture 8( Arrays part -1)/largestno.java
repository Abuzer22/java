// import java.util.*;

public class largestno {
    public static int largestvalue(int arr[]){
        int largest = Integer.MIN_VALUE; // - infinity
        int smallest = Integer.MAX_VALUE; // + infiity
        for(int i =0;i<arr.length;i++){
            if(largest< arr[i]){
                largest = arr[i];
            }
            if(smallest> arr[i]){
                smallest = arr[i];
            }
            
        }
        System.out.println("Smallest value is : " +smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {8,9,4,2,40,79,67};
        System.out.println("Largest value is : " +largestvalue(arr));

    }


}
