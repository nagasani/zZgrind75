package com.grind.meta;

import java.util.Stack;

class MyQueue {

    public Stack<Integer> inStack;
    public Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }
    
    public void push(int x) {
        inStack.push(x);       
    }
    
    public int pop() 
    {
         if(outStack.isEmpty()) 
         {
            // Transfer elements from inStack to outStack to reverse the order
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }
    
    public int peek() {
         if (outStack.isEmpty()) {
            // Transfer elements from inStack to outStack to reverse the order
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }
    
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */