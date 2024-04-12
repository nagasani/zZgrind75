package com.grind.imp;
class Solution876 
{
    public ListNode middleNode(ListNode head) {
        if(head.next == null ) return head;
        ListNode node = head;
        int size = 1;
        while(node.next !=  null){           
            node = node.next;
             size++;
        }
        System.out.println(size);
        int middleNodeIndex = (size/2)+1;
        System.out.println(middleNodeIndex);
        size =1;
        while(head.next != null){    
            head = head.next; 
            size++;           
            if(middleNodeIndex == size) {
                break;
            }
                  
        } 
        return head;
    }
    
    public class ListNode {
    	     int val;
    	     ListNode next;
    	     ListNode() {}
    	     ListNode(int val) { this.val = val; }
    	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    	 }
}