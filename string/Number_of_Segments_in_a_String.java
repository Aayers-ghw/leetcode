package string;

public class Number_of_Segments_in_a_String {

    public int countSegments(String s) {
        if(s.length() == 0){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < s.length(); ++i){
            if((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' '){
                count++;
            }
        }
        return count;
    }
}
