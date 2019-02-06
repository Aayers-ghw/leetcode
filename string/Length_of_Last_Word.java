package string;

public class Length_of_Last_Word {

//	//solution I
//	public int lengthOfLastWord(String s) {
//        if(s.length() == 0) return 0;
//        int j = 0;
//        int k = 0;
//        for(int i = 0; i < s.length(); ++i){
//            if(s.charAt(i) != ' '){
//                j++;
//                k = j;
//            }else{
//                j = 0;
//            }
//        }
//        if(s.charAt(s.length() - 1) == ' '){
//            return k;
//        }else{
//            return j;
//        }
//    }
	
	//solution II
	public int lengthOfLastWord(String s) {
        int tail = s.length() - 1;
        int len = 0;
        while(tail >= 0 && s.charAt(tail) == ' ')  tail--;
        while(tail >= 0 && s.charAt(tail) != ' '){
            len++;
            tail--;
        }
        return len;
    }
}
