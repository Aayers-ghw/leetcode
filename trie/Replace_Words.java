package trie;

import java.util.List;

public class Replace_Words {
	class TrieNode{
        TrieNode[] children = new TrieNode[26];
        String word;
    }
    public String replaceWords(List<String> dict, String sentence) {
        TrieNode root = new TrieNode();
        for(String d : dict){
            TrieNode p = root;
            for(int i = 0; i < d.length(); ++i){
                int index = d.charAt(i) - 'a';
                if(p.children[index] == null){
                    p.children[index] = new TrieNode();
                }
                p = p.children[index];
            }
            p.word = d;
        }
        
        StringBuffer sb = new StringBuffer();
        for(String s : sentence.split("\\s+")){
            if(sb.length() > 0) sb.append(" ");
            TrieNode p = root;
            for(int i = 0; i < s.length(); ++i){
                int index = s.charAt(i) - 'a';
                if(p.children[index] == null || p.word != null)   break;
                p = p.children[index];
            }
            sb.append(p.word == null ? s : p.word);
        }
        return sb.toString();
    }
}
