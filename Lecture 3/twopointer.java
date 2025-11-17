// Sum of two numbers.

public class twopointer {
    public static void main(String[] args){
        int arr[] = {1,2,4,7,11,15};
        int left = 0 , right = arr.length-1;
        boolean found = false;

        while (left< right){
            int sum = arr[left] + arr[right];
            if (sum == 15){
                found = true;
                System.out.println("pairs are " + left + " and " + right);
                break;

            }else if(sum < 15){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(found? "Yes, pair exists" : "No Pair Found" );

    }
    
}
