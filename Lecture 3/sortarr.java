import java.util.*;

public class sortarr {
    public static void main(String[] args){
    Integer[] arr = {5,8,3,4,9,8,1,0,7,4};
        Arrays.sort (arr);

        System.out.println("Sorted Array (Ascending):");
        for(int num : arr){
            System.out.print(num + " ");
        }

    }

}
