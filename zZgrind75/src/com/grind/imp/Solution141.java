package com.grind.imp;

import java.util.HashSet;
import java.util.Set;

//Need to revisit
public class Solution141 
{
	public boolean hasCycle1(ListNode head) {
		
		int position = 0;
		Set<ListNode> set = new HashSet<>();		
		while(head.next != null) {
			if(set.contains(head.next)) {
				return true;
			}	
			set.add(head.next);
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
	
	public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}