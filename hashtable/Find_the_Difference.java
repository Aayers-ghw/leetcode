package hashtable;

public class Find_the_Difference {
    public char findTheDifference(String s, String t) {
       int charCodeT = 0, charCodeS = 0;
       for(int i = 0; i < s.length(); i++) {
    	   charCodeS += (int)s.charAt(i);
       }
       for(int i = 0; i < t.length(); i++) {
    	   charCodeT += (int)t.charAt(i);
       }
       
       return (char)(charCodeS - charCodeT);
    }
}
