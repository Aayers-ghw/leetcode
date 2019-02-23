package bit_manipulation;

public class Number_of_1_Bits {

	//Loop and Flip
//	public int hammingWeight(int n) {
//        int flag = 1;
//        int count = 0;
//        while(flag != 0){
//            if((n & flag) != 0){
//                count++;
//            }
//            flag = flag << 1;
//        }
//        return count;
//    }
	
	//Bit Manipulation Trick
	public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            count++;
            n = (n - 1) & n;
        }
        return count;
    }
	
}
