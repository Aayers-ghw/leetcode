package string;

public class Robot_Return_to_Origin {

	public boolean judgeCircle(String moves) {
        int cnt1 = 0, cnt2 = 0;
        for(int i = 0; i < moves.length(); ++i){
            if(moves.charAt(i) == 'U'){
                cnt1++;
            }else if(moves.charAt(i) == 'D'){
                cnt1--;
            }else if(moves.charAt(i) == 'R'){
                cnt2++;
            }else if(moves.charAt(i) == 'L'){
                cnt2--;
            }
        }
        return cnt1 == 0 && cnt2 == 0;
    }
}
