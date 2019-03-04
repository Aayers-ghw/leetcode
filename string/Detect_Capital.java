package string;

public class Detect_Capital {

    public boolean detectCapitalUse(String word) {
        if(word == null || word.length() == 0){
            return false;
        }
        int cnt = 0;
        for(char ch : word.toCharArray()){
            if('Z' - ch >= 0){
                cnt++;
            }
        }
        return cnt == 0 || cnt == word.length() || (cnt == 1 && 'Z' - word.charAt(0) >= 0);
    }
}
