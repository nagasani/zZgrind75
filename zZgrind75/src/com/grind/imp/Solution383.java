package com.grind.imp;

import java.util.HashMap;
import java.util.Map;

class Solution383 
{
	public static boolean canConstruct1(String ransomNote, String magazine) 
	{	
		for(char c : magazine.toCharArray()) {
			System.out.println(Character.toString(c));
			ransomNote = ransomNote.replaceFirst(Character.toString(c),"");
			if(ransomNote.equals("")) {
				break;
			}
		}
		return ransomNote.equals("") ? true : false;
	}
	
	public boolean canConstruct2(String ransomNote, String magazine) {
	        Map<Character, Integer> ransomNoteMap = countCharacterOccurrences(ransomNote);
	        Map<Character, Integer> magazineMap = countCharacterOccurrences(magazine);

	        for (char ch : ransomNoteMap.keySet()) {
	            if (!magazineMap.containsKey(ch) || magazineMap.get(ch) < ransomNoteMap.get(ch)) {
	                return false;
	            }
	        }

	        return true;
	    }

	    private Map<Character, Integer> countCharacterOccurrences(String text) {
	        Map<Character, Integer> map = new HashMap<>();
	        for (char ch : text.toCharArray()) {
	            map.put(ch, map.getOrDefault(ch, 0) + 1);
	        }
	        return map;
	    }
	
	  public static boolean canConstruct(String ransomNote, String magazine) {
	        int[] charCounts = new int[26];

	        // Count the occurrences of each character in the magazine
	        for (char ch : magazine.toCharArray()) {
	            charCounts[ch - 'a']++;
	        }

	        // Check if we have enough characters from the magazine to form the ransom note
	        for (char ch : ransomNote.toCharArray()) {
	            if (charCounts[ch - 'a'] == 0) {
	                return false;
	            }
	            charCounts[ch - 'a']--;
	        }

	        return true;
	    }
	  
	public static void main(String[] args) {
		System.out.println(canConstruct("aa","aab"));
		//System.out.println(canConstruct("aa","ab"));
	}
}