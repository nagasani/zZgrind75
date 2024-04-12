package com.grind.misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class PeekingIterator implements Iterator<Integer> 
{
	List<Integer> list;
	
	public PeekingIterator(Iterator<Integer> iterator) 
	{
	   list = new ArrayList<>();
	   while(iterator.hasNext()) 
	   {
		   //list.add(iteroato)
	   }
		
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return null;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    return null;
	}
	
	@Override
	public boolean hasNext() {
	    return false;
	}
}