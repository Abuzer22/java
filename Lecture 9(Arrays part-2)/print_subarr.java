public class print_subarr {

    // yellow MAX SUBARRAY SUM (BRUTE FORCE) 

    // public static void print_subarray(int nums[]){
    //     int currentsum = 0;
    //     int maxsum = Integer.MIN_VALUE;
    //     for(int i = 0; i< nums.length;i++){
    //         int start = i;
    //         for(int j = i; j< nums.length; j++){
    //             int end = j;
    //             currentsum = 0;
    //         for(int k = start; k <= end; k++){
    //             System.out.println(k +"currsum is :  "+currentsum);
    //             currentsum += nums[k];
    //             System.out.println(k+ " in 3rd  loop is end.");
    //         }
    //         System.out.println("now currsum is : " +currentsum);
    //         if(maxsum < currentsum){
    //             maxsum = currentsum;
    //         }
    //         System.out.println();
            
    //         }
    //     }
    //     System.out.println(" MaxSum is : " +maxsum);
    // }

    // yellow Max Sum Array Sum (PREFIX SUM ) 

    //    public static void print_subarr_presum(int nums[]){
    //     int currentsum = 0;
    //     int maxsum = Integer.MIN_VALUE;
    //     int prefix[] = new int[nums.length];
    //     prefix[0] = nums[0];
    //     for(int i=1 ; i< nums.length; i++){
    //         prefix[i] = prefix[i-1] + nums[i];

    //     }
        
    //     for(int i = 0; i< nums.length;i++){
    //         int start = i;
    //         for(int j = i; j< nums.length; j++){
    //             int end = j;
    //             currentsum = start==0?prefix[end] : prefix[end ] - prefix[start -1];
            
    //         System.out.println("now currsum is : " +currentsum);
    //         if(maxsum < currentsum){
    //             maxsum = currentsum;
    //         }
    //         System.out.println();
            
    //         }
    //     }
    //     System.out.println(" MaxSum is : " +maxsum);
    // }

    // yellow MAX SUB ARRAY SUM (KADAN'S ALGO)

//     public static void kadans_algo(int nums[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;
//         for(int i = 0; i< nums.length; i++){
//             cs = cs + nums[i];
//             System.out.println("now current sum is : " +cs);
//             ms = Math.max(cs, ms);
//             System.out.println("now max sum is : " +ms);
//             // if(cs <0){
//             //     cs =0;
//             // }


//         }
//         System.out.println(" max sum is : "  +ms);

//     }

//purple  TRAPING RAINWATER(MEDIUM LEVEL QUESTION)  

    public static int trapping_rainwater(int hight[]){
        // Calculate leftmax boundary.
        int n = hight.length;
        int leftmax[] = new int[n];
        leftmax[0] = hight[0];
        for(int i = 1; i < n; i++){
            leftmax[i] = Math.max(hight[i], leftmax[i-1]);
        }
        // Calculate rightmax boundary.
        int rightmax[] = new int[n];
        rightmax[n-1] = hight[n-1];
        for(int i = n-2; i >= 0; i--){
            rightmax[i] = Math.max(hight[i], rightmax[i+1]);

        }

        // loop
        int trappedwater = 0;

        for(int i = 0; i< n; i++){

            // Waterlevel = min(leftmax[i],rightmax[i])
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            // trappedwater = waterlevel - hight_of_ bar
            trappedwater += waterlevel- hight[i];
            
        }
        return trappedwater;
    }

    public static void main(String[] args) {
        // int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        // int nums[] = {-2,-3,-1}; // for kadan's special case
        int hight[] = {4,2,0,6,3,2,5};
        System.out.println(trapping_rainwater(hight));

        
    }
    
}
