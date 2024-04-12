package com.grind.misc;


public class Solution141 {
    public boolean hasCycle(ListNode head) {
        if(head == null){return false;}
        ListNode next = null;
        while(head.next != null) {
        	next = head.next;
        	if(checkNode(next, head.next)) {
        		return true;
        	}
        	head = head.next;
        }
        return false;
    }
    
    public static boolean checkNode(ListNode node, ListNode head) 
    {
    	while(head.next != null) 
    	{
    		if(node == head.next) 
    		{
    			return true;
    		}
    		head = head.next;
    	}
    	return false;
    }
    
    class ListNode 
	{
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}