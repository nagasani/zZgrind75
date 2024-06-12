package com.grind.misc;

import java.util.LinkedList;
import java.util.Queue;

class MyStack 
{
	Queue<Integer> queue1 = new LinkedList<>();
	Queue<Integer> queue2 = new LinkedList<>();
	//Stack LIFO  1,2,3,4  push pop top 
	//Queue FIFO  1,2,3,4  offer poll peek
	
    public MyStack() {
        
    	
    }
    
    public void push(int x) 
    {
        if(queue1.peek() == null) 
        {
        	queue1.offer(x);
        }
        else 
        {
        	queue2.offer(queue1.poll());
        }    	
    }
    
    public int pop() 
    {
    	int val = 0;
    	if(queue1.size() == 1) 
    	{
    		val = queue1.poll();
    		while(queue2.peek() != null) 
    		{
    			//queue1.
    		}
    	}
    	return val;
    }
    
    public int top() {
        
    	return 1;
    }
    
    public boolean empty() {
    	
    	return false;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */