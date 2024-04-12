package com.grind.imp;
import java.util.*;

public class Solution127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) {
            return 0; // Early exit if endWord is not in wordList
        }
        
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level = 1;
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            
            for (int i = 0; i < levelSize; i++) {
                String currentWord = queue.poll();
                
                char[] wordChars = currentWord.toCharArray();
                for (int j = 0; j < currentWord.length(); j++) {
                    char originalChar = wordChars[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == originalChar) {
                            continue;
                        }
                        
                        wordChars[j] = c;
                        String transformedWord = new String(wordChars);
                        
                        if (transformedWord.equals(endWord)) {
                            return level + 1;
                        }
                        
                        if (wordSet.contains(transformedWord)) {
                            queue.offer(transformedWord);
                            wordSet.remove(transformedWord);
                        }
                    }
                    wordChars[j] = originalChar; // Restore the original character
                }
            }
            
            level++;
        }
        
        return 0; // No transformation sequence found
    }
}
