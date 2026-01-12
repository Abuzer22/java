public class binarysrch {
    public static int  bnrysrch(int arr[], int key){
        int start = 0, end = arr.length -1;
        while(start <= end){
            int mid = (start + end)/2;

            // comparision
            if(arr[mid]== key){
                return mid;
            }
            if(arr[mid] > key){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }

        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 26;

        System.out.println("Index for the key is : " +bnrysrch(arr, key));

    }
}
