package com.grind.misc;

public interface AppGeneric {
	
	class Message<T> 
	{
		T payload;
		
		void payload(T data) 
		{
			this.payload = data;
		}
		
		T payload() 
		{
			return this.payload;
		}		
	}
	
	static void main(String[] args) 
	{
		var msg = new Message<String>();
		msg.payload("Test");
		String  payload = msg.payload();
		System.out.println(payload);
	}

}
