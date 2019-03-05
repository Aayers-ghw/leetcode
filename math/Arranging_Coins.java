package math;

public class Arranging_Coins {

    //Solution I
    // public int arrangeCoins(int n) {
    //     if(n < 1){
    //         return 0;
    //     }
    //     int res = 0;
    //     for(int i = 1; i <= n; ++i){
    //         if(n < i){
    //             break;
    //         }
    //         res++;
    //         n -= i;
    //     }
    //     return res;
    // }
    
    //Solution II
    public int arrangeCoins(int n) {
        return (int)(-1 + Math.sqrt(1 + 8 * (long)n)) / 2;
    }
}
