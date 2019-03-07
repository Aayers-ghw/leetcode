package array;

public class Fibonacci_Number {

    public int fib(int N) {
        if(N < 2){
            return N;
        }
        int prepreNum = 0;
        int preNum = 1;
        int res = 0;
        for(int i = 2; i <= N; ++i){
            res = prepreNum + preNum;
            prepreNum = preNum;
            preNum = res;
        }
        return res;
    }
}
