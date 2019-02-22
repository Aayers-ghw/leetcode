package string;

public class Student_Attendance_Record_I {

	public boolean checkRecord(String s) {
        int x = 0, y = 0, z = 0;
        int cnt = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'A'){
                x++;
                cnt = 0;
            }else if(ch == 'L'){
                cnt++;
                if(cnt == 3){
                    return false;
                }
                y++;
            }else{
                z++;
                cnt = 0;
            }
        }
        if(x <= 1)  return true;
        return false;
    }
}
