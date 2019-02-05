package string;

public class Implement_strStr {

	//BF
	public int strStr(String haystack, String needle) {
        if(needle == null)  return 0;
        int i = 0;
        int j = 0;
        while(i < haystack.length() && j < needle.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }else{
                i = i - j + 1;
                j = 0;
            }
        }
        if(j >= needle.length()){
            return i - needle.length();
        }else{
            return -1;
        }
    }
}
