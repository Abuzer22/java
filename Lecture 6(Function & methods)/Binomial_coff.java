 //nCr = n!/r!(n-r)!

public class Binomial_coff {

    public static int printfactorial(int n){

    int fact = 1;
    for(int i =1; i<=n; i++){
        fact= fact*i;
    }
    return fact;

    }

    public static int bin_coff(int n,int r){
        int fact_n = printfactorial(n);
        int fact_r = printfactorial(r);
        int fact_nmr = printfactorial(n-r);

        int bincoff = fact_n/(fact_r * fact_nmr);
        return bincoff;

    }



    public static void main(String[] args) {

        System.out.println(bin_coff(5  , 2));
        
    }
    
}
