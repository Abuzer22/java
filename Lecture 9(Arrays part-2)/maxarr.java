public class maxarr { 
    public static void maxarray(int arr[]){ //BRUTE FORCE
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

    public static void arrsumprefix(int arr[]){ // PREFIX SUM
        int currentsum =0;
        int maximumsum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        //calculate prefix array
        for(int i=1; i< prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0;i<arr.length; i++){
            int start =i;   
            for(int j=i;j<arr.length; j++){
                int end = j;
                currentsum = start ==0 ? prefix[end] : prefix[end]-prefix[start -1];

                if(maximumsum < currentsum){
                    maximumsum =currentsum;

                }

            }
        }
        System.out.println("Max sum = " +maximumsum);
    }

    public static void arrsumKADANalgo(int arr[]){ // KADANE'S ALGORITHM
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i < arr.length; i++  ){
            cs+=arr[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our max subarray is : " +ms);
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        arrsumprefix(arr);
    }
}
