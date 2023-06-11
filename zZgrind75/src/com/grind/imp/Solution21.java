package com.grind.imp;

//Definition for singly-linked list.


class Solution21 {
	
	  public static void main(String[] args) {
	    	ListNode head = new Solution21().new ListNode(0); 
	    	head.next = new Solution21().new ListNode(2);
	    	head.next.next = new Solution21().new ListNode(3);
	    	head.next.next.next = new Solution21().new ListNode(8);
	    	
	    	ListNode head1 = new Solution21().new ListNode(1); 
	    	head1.next = new Solution21().new ListNode(4);
	    	head1.next.next = new Solution21().new ListNode(9);
	    	head1.next.next.next = new Solution21().new ListNode(15);
	    	//head.next.next.next = head.next;
	    	
	    	Solution21 sol = new Solution21();
			System.out.println(sol.mergeTwoLists(head, head1));
		}
	  
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {    
    	ListNode currentNode = list2;
    	while(currentNode != null) 
    	{
    		if(list2.val != 0) 
    		{
    			list1 = addNode(list1, list2.val);
    		}
    		list2 = list2.next;    		
    	}        
    	return list1;
    }
    
    public ListNode addNode(ListNode list1, int val) 
    {
    	ListNode currentNode = list1.next;
    	while(currentNode != null) 
    	{
    		if(currentNode.val >= val && currentNode.next.val > val ) {
    			ListNode newNode = new ListNode(val);
    			newNode.next = currentNode.next;
    			currentNode.next = newNode;    			 
    		}    			
    		else {
    			currentNode = currentNode.next;
    		}
    	}  
    	return list1;
    }
    
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}