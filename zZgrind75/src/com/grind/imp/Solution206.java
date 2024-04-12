package com.grind.imp;

import java.util.Stack;

//Review It
class Solution206 
{
    public ListNode reverseList1(ListNode head) {
     	Stack<ListNode> stack = new Stack<>();
		if (head == null || head.next == null) {
            return head;
        }		
		while(head != null) 
		{
            //System.out.println(head.val);
			stack.push(new ListNode(head.val));
			head = head.next;
		}
		head = stack.pop();
		ListNode node =stack.pop();
        head.next = node;
		while(!stack.isEmpty())
		{
			node.next = stack.pop();
			node = node.next;
		}	 	        
		return head; 
    }
    
    public ListNode reverseList2(ListNode head) {
     	
    	ListNode current = head;
    	ListNode prev = null;
    	
		while(current != null) 
		{			
			  	
		}
			 	        
		return head; 
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
    
    class ListNode 
	{
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;			
		}
		
		ListNode(int val, ListNode next) 
		{ 
			this.val = val; 
			this.next = next; 
		}
	}
}