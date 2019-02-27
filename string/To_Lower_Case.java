package string;

public class To_Lower_Case {

    public String toLowerCase(String str) {
        if(str == null || str.length() == 0) return str;
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; ++i){
            if(ch[i] >= 'A' && ch[i] <= 'Z'){
                ch[i] = (char)(ch[i] - 'A' + 'a');                
            }
        }
        return new String(ch);
    }
}
