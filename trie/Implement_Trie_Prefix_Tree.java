package trie;

class TrieNode{
    private char data;
    public boolean isEndingChar = false;
    public TrieNode[] children = new TrieNode[26];
    public TrieNode(char data){
        this.data = data;
    }
}

public class Implement_Trie_Prefix_Tree {

	class Trie {

	    
	    private TrieNode root = new TrieNode('/');
	    /** Initialize your data structure here. */
	    public Trie() {
	        
	    }
	    
	    /** Inserts a word into the trie. */
	    public void insert(String word) {
	        TrieNode p = root;
	        for(int i = 0; i < word.length(); ++i){
	            int index = word.charAt(i) - 'a';
	            if(p.children[index] == null){
	                TrieNode newNode = new TrieNode(word.charAt(i));
	                p.children[index] = newNode;
	            }
	            p = p.children[index];
	        }
	        p.isEndingChar = true;
	    }
	    
	    /** Returns if the word is in the trie. */
	    public boolean search(String word) {
	        TrieNode p = root;
	        for(int i = 0; i < word.length(); ++i){
	            int index = word.charAt(i) - 'a';
	            if(p.children[index] == null)   return false;
	            p = p.children[index];
	        }
	        if(p.isEndingChar == false){
	            return false;
	        }else{
	            return true;
	        }
	    }
	    
	    /** Returns if there is any word in the trie that starts with the given prefix. */
	    public boolean startsWith(String prefix) {
	        TrieNode p = root;
	        for(int i = 0; i < prefix.length(); ++i){
	            int index = prefix.charAt(i) - 'a';
	            if(p.children[index] == null)   return false;
	            p = p.children[index];
	        }
	        return true;
	    }
	}
}
