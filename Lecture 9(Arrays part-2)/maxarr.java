public class maxarr { //BRUTE FORCE
    public static void maxarray(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i < arr.length;i++){
            for(int j=i;j < arr.length;j++){
                currsum =0;
                for(int k = i;k<=j;k++){
                    System.out.print(arr[k]+ " ");
                    currsum+=arr[k];
                    
                }
                System.out.println("sum : " +currsum);
                if(currsum > maxsum){
                    maxsum = currsum;
                }
            }
            System.out.println();
        }
        System.out.println("Maxsum is : "+maxsum);

    }
    public static void main(String[] args) {
        int arr[] = {5,10,15,20,25};
        maxarray(arr);
    }
}
