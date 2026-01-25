public class trappingrainwtr {
    public static int trpingwtr(int hight[]){ // TIME COMPLEXITY = 0(n)
        int n = hight.length;
        // Calculate left max boundary
        int leftmax[] = new int[n];
        leftmax[0]=hight[0];
        for(int i=1; i<n; i++ ){
            leftmax[i] = Math.max(hight[i],leftmax[i-1]);

        }

        // Calculate right max boundary
        int rightmax[] = new int[n];
        rightmax[n -1] = hight[n - 1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] =Math.max(hight[i], rightmax[i+1]);
        }
        int trapwater = 0;
        // loop
        for( int i = 0 ; i < n ; i++ ){
            // WaterLevel = min(leftmax,rightmax)
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            //trapper water = waterLevel - hight[i]
            trapwater += waterLevel - hight[i];
        }
        return trapwater;
    }

    public static void main(String[] args) {
        int hight[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trepped Water is : "+trpingwtr(hight));
    }
}
