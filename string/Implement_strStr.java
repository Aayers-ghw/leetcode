package string;

public class Implement_strStr {

//	//BF
//	public int strStr(String haystack, String needle) {
//        if(needle == null)  return 0;
//        int i = 0;
//        int j = 0;
//        while(i < haystack.length() && j < needle.length()){
//            if(haystack.charAt(i) == needle.charAt(j)){
//                i++;
//                j++;
//            }else{
//                i = i - j + 1;
//                j = 0;
//            }
//        }
//        if(j >= needle.length()){
//            return i - needle.length();
//        }else{
//            return -1;
//        }
//    }
	
	//KMP
	private int[] next;
    public int strStr(String haystack, String needle) {
        if(needle == null)  return 0;
        
        int i = 0;
        int j = 0;
        getNext(needle);
        while(i < haystack.length() && j < needle.length()){
            if(j == -1 || haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }else{
                j = next[j];
            }
        }
        if(j == needle.length()){
            return i - j;
        }else{
            return -1;
        }
    }
    public void getNext(String needle){
        next = new int[needle.length() + 1];
        next[0] = -1;
        int i = 0;
        int j = -1;
        while(i < needle.length()){
            if(j == -1 || needle.charAt(i) == needle.charAt(j)){
                ++i;
                ++j;
                next[i] = j;
            }else{
                j = next[j];
            }
        }
    }
}
