package com.grind.imp;
class Solution76 {
    public String minWindow(String s, String t) {
         if (t.length() > s.length()) return "";
        int[] counts = new int[256];
        for (char c : t.toCharArray()) {
            counts[c]++;
        }
        int left = 0, right = 0, n = t.length(), start = 0, len = Integer.MAX_VALUE;
        char[] chars = s.toCharArray();
        while (right < s.length()) {
            if (counts[chars[right++]]-- > 0) n--;
            while (n == 0) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
                } 
                if (counts[chars[left++]]++ >= 0) n++;
            }
        }
        len = len == Integer.MAX_VALUE ? 0 : len;
        return s.substring(start, start + len);
        
    }
}