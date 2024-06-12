package com.grind.misc;

import java.util.HashSet;

class WordDictionary 
{
	HashSet<String> set;
			
    public WordDictionary() {
        this.set = new HashSet<>(); 
    }
    
    public void addWord(String word) {
        set.add(word);
    }
    
    public boolean search(String word) 
    {
    	if(!word.contains(".")) 
    	{
    		return set.contains(word);
    	}
    	else
    	{
    		char[] w = word.toCharArray();  
    		for(String s : set) 
    		{    			
    			if(w.length == s.length()) 
    			{    			
    				char[] s1 = s.toCharArray();
	    			for(int j=0; j < s1.length; j++) 
	    			{	    				
	    				if(w[j] == '.' || w[j] == s1[j]) 
	    				{
	    					if(j == s1.length-1) 
	    					{
	    						return true;
	    					}	    					
	    				}
	    				else 
	    				{
	    					break;
	    				}
	    			}
    			}
    		}
    	}
    	return false;
    }
    
    public static void main1(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        System.out.println("search('pad'): " + wordDictionary.search("pad")); // return False
        System.out.println("search('bad'): " + wordDictionary.search("bad")); // return True
        System.out.println("search('.ad'): " + wordDictionary.search(".ad")); // return True
        System.out.println("search('b..'): " + wordDictionary.search("b..")); // return True
    }
    
    public static void main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        
        wordDictionary.addWord("at");
        wordDictionary.addWord("and");
        wordDictionary.addWord("an");
        wordDictionary.addWord("add");
        
        // Output expected for each search
        System.out.println("search('a'): " + wordDictionary.search("a"));     // return False
        System.out.println("search('.at'): " + wordDictionary.search(".at")); // return False
        wordDictionary.addWord("bat");
        System.out.println("search('.at'): " + wordDictionary.search(".at")); // return True
        System.out.println("search('an.'): " + wordDictionary.search("an.")); // return True
        System.out.println("search('a.d.'): " + wordDictionary.search("a.d.")); // return False
        System.out.println("search('b.'): " + wordDictionary.search("b."));   // return False
        System.out.println("search('a.d'): " + wordDictionary.search("a.d")); // return True
        System.out.println("search('.'): " + wordDictionary.search("."));     // return False
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */