// A CONTINIOUS PART OF ARRAY.

public class subarr {
    public static void printsubarr(int num[]){
        int ts =0;
        int currsum =0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<num.length;i++){
            int start = i;
            for( int j= i;j<num.length;j++){
                int end = j;
                currsum =0;
                for(int k = start;k<=end;k++ ){ 
                    //print
                    System.out.println(num[k]+ " ");
                   // Subarray sum
                   
                    currsum+=num[k];
                    ts++;
                }
                System.out.println("The sum of subarray is = " +currsum);
                if(maxsum < currsum){
                    maxsum = currsum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum sum is : " +maxsum);
        System.out.println("Total Subarray = " +ts);
    }

    public static void main(String[] args) {
        int num[] = {-1,-2,6,-1,3};
        printsubarr(num);

    }
}
