package com.grind.imp;

import java.util.PriorityQueue;

//Revisit Revisit Revisit Please
class Solution23 {
	
	class ListNode {
	    int val;
	    ListNode next;

	    ListNode() {
	    }

	    ListNode(int val) {
	        this.val = val;
	    }

	    ListNode(int val, ListNode next) {
	        this.val = val;
	        this.next = next;
	    }
	}
    public ListNode mergeKLists(ListNode[] lists) 
    {
    	
        if (lists == null || lists.length == 0) {
            return null;
        }

        // Create a min-heap (priority queue) to maintain the smallest element from each list
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add the first node from each list to the min-heap
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }

        // Create a dummy head and a current pointer for the merged list
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;

        // Continue merging until the min-heap is empty
        while (!minHeap.isEmpty()) {
            // Get the smallest node from the min-heap
            ListNode smallest = minHeap.poll();

            // Append it to the merged list
            current.next = smallest;
            current = current.next;

            // Move to the next node in the list from which the smallest node came
            if (smallest.next != null) {
                minHeap.offer(smallest.next);
            }
        }

        return dummyHead.next;
        
    }
}