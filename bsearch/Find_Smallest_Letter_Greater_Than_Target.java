package bsearch;

public class Find_Smallest_Letter_Greater_Than_Target {

    //Soluton I
    // public char nextGreatestLetter(char[] letters, char target) {
    //     boolean[] seen = new boolean[26];
    //     for(char c : letters){
    //         seen[c - 'a'] = true;
    //     }
    //     while(true){
    //         target++;
    //         if(target > 'z')    target = 'a';
    //         if(seen[target - 'a'])  return target;
    //     }
    // }
    
    //Solution II
    // public char nextGreatestLetter(char[] letters, char target) {
    //     for(char c : letters){
    //         if(c > target)  return c;
    //     }
    //     return letters[0];
    // }
    
    //Solution II
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        while(left <= right){
            int mid = left + ((right - left) >> 1);
            if(target >= letters[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return letters[left % letters.length];
    }
}
