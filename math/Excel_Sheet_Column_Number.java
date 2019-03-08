package math;

public class Excel_Sheet_Column_Number {

    public int titleToNumber(String s) {
        if(s == null || s.length() == 0){
            return -1;
        }
        int result = 0;
        for(int i = 0; i < s.length(); ++i){
            result = result * 26 + s.charAt(i) - 'A' + 1;
        }
        return result;
    }
}
