package string;

public class Longest_Common_Prefix {

	public String longestCommonPrefix(String[] strs) {
		 if(strs.length == 0 || strs[0].equals("")){
			 return "";
		 }
		 
		 String temp = strs[0];
		 
		 for(int i = 1; i < strs.length; i++){
			 if(strs[i].length() == 0){
				 return "";
			 }else if(strs[i].length() < temp.length()){
				 for(int j = 0; j < strs[i].length(); j++){
					 if(strs[i].charAt(j) != temp.charAt(j)){
						 temp = strs[i].substring(0, j);
						 break;
					 }
					 if(j == (strs[i].length() - 1)){
						 temp = strs[i];
					 }
				 }
			 }else{
				 for(int j = 0; j < temp.length(); j++){
					 if(strs[i].charAt(j) != temp.charAt(j)){
						 temp = temp.substring(0, j);
						 break;
					 }
				 }
			 }
			 
		 }
		 
		 return temp;
	 }
	 public static void main(String[] args) {
		 Longest_Common_Prefix mainTest = new Longest_Common_Prefix();
		 String[] strings = {"aa","a"};
		 String result = mainTest.longestCommonPrefix(strings);
		 System.out.println(result);
	}
}
