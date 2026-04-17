// QUESTION 1 : Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// Example 1: Input:nums = [1, 2, 3, 1]
// Output:   true

import java.util.*;

public class _1Question {
    public static boolean checkvalue (int nums[]){
        for(int i=0; i< nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                if( nums[i] == nums[j]){
                   return true ;
                }
            
            }
        }
        return false;
    }        
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int [20];
        System.out.println("Tell me Array");
        nums[0] = sc.nextInt();
        nums[1] = sc.nextInt();
        nums[2] = sc.nextInt();
        nums[3] = sc.nextInt();
        nums[4] = sc.nextInt();
        nums[5] = sc.nextInt();
        sc.close();
        // int nums[] = {1, 2, 3, 4,  };
        System.out.println(checkvalue(nums));
    }
}
