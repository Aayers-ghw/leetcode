package bsearch;

public class Single_Number_III {

    public int[] singleNumber(int[] nums) {
        if(nums == null || nums.length <2){
            return new int[2];
        }
        int[] result = new int[2];
        int res = 0;
        for(int val : nums){
            res ^= val;
        }
        int index = findFirst1(res);
        for(int val : nums){
            if(isBit1(val, index)){
                result[0] ^= val;
            }else{
                result[1] ^= val;
            }
        }
        return result;
    }
    public boolean isBit1(int val, int index){
        val = val >> index;
        return (val & 1) == 0;
    }
    public int findFirst1(int res){
        int index = 0;
        while((res & 1) == 0){
            index++;
            res = res >> 1;
        }
        return index;
    }
}
