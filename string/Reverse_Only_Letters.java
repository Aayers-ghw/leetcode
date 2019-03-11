package string;

public class Reverse_Only_Letters {

    //Solution I
    // public String reverseOnlyLetters(String S) {
    //     if(S == null || S.length() == 0){
    //         return S;
    //     }
    //     Stack<Character> stack = new Stack<>();
    //     for(char c : S.toCharArray()){
    //         if(Character.isLetter(c)){
    //             stack.push(c);
    //         }
    //     }
    //     StringBuffer sb = new StringBuffer();
    //     for(char c : S.toCharArray()){
    //         if(Character.isLetter(c)){
    //             sb.append(stack.pop());
    //         }else{
    //             sb.append(c);
    //         }
    //     }
    //     return sb.toString();
    // }
    
    //Solution II
    public String reverseOnlyLetters(String S) {
        if(S == null || S.length() == 0){
            return S;
        }
        int i = 0;
        int j = S.length() - 1;
        StringBuffer sb = new StringBuffer();
        for(; i < S.length(); ++i){
            if(Character.isLetter(S.charAt(i))){
                while(!Character.isLetter(S.charAt(j))){
                    j--;
                }
                sb.append(S.charAt(j--));
            }else{
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }
}
