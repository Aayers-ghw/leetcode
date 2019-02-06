package string;

public class Count_and_Say {

	public String countAndSay(int n) {
        StringBuffer sb = new StringBuffer("1");
        char[] curSeq = "1".toCharArray();
        for(int i = 1; i < n; ++i){
            sb = new StringBuffer();
            int count = 1;
            for(int j = 0; j < curSeq.length - 1; ++j){
                if(curSeq[j] != curSeq[j + 1]){
                    sb.append(count + "" + curSeq[j]);
                    count = 1;
                }else{
                    count++;
                }
            }
            sb.append(count + "" + curSeq[curSeq.length - 1]);
            curSeq = sb.toString().toCharArray();
        }
        return sb.toString();
    }
}
