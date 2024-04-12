package com.grind.misc;
class Solution92 
{
	public class ListNode 
	{
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) {	this.val = val;}

		ListNode(int val, ListNode next) 
		{
			this.val = val;
			this.next = next;
		}
	}
	 
    public ListNode reverseBetween(ListNode head, int left, int right) {
    	
    	boolean odd = (left+right)%2 == 0? true : false;
    	if(odd) 
    	{
    		
    	}	
        
    	return null;
    }
}