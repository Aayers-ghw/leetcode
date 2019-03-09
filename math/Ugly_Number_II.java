package math;

import java.util.ArrayList;
import java.util.List;

public class Ugly_Number_II {

    public int nthUglyNumber(int n) {
        List<Integer> res = new ArrayList<>();
        int i2 = 0, i3 = 0, i5 = 0;
        res.add(1);
        while(res.size() < n){
            int s2 = res.get(i2) * 2;
            int s3 = res.get(i3) * 3;
            int s5 = res.get(i5) * 5;
            int min = Math.min(s2, Math.min(s3, s5));
            if(min == s2){
                i2++;
            }
            if(min == s3){
                i3++;
            }
            if(min == s5){
                i5++;
            }
            res.add(min);
        }
        return res.get(res.size() - 1);
    }
}
