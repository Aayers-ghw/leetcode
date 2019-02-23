package bit_manipulation;

public class Power_of_Two {

    public boolean isPowerOfTwo(int n) {
        if(n <= 0)  return false;
        return ((n - 1) & n) == 0 ? true : false;
    }
}
