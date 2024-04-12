package com.grind.misc;

import java.util.HashMap;
import java.util.Map;

public class WhatAContractEqualsAndHashCode {
	
	public static void main(String[] args) 
	{
		WhatAContractEqualsAndHashCode w1 = new WhatAContractEqualsAndHashCode();
		Employee e1 = w1.new Employee();
		System.out.println("hashCode "+e1.hashCode());
		e1.setId(1);
		e1.setName("Ram");
		 
		Employee e2 = w1.new Employee();
		System.out.println("hashCode "+e2.hashCode());
		e2.setId(1);
		e2.setName("Ram1");
		
		Map<Employee, String> map = new HashMap<>();
		map.put(e1, "Hello1");
		map.put(e2, "Hello2");
		
		for(Employee emp : map.keySet()) 
		{
			System.out.println(emp.id + " : " +emp.name);
		}
		 
		System.out.println("Shallow compare "+(e1 == e2));		
		System.out.println("Deep compare "+(e1.equals(e2)));
	}

	public class Employee
	{
		private int id;
		private String name;
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public int hashCode() {			
			return this.id;
		}
		
		@Override
		public boolean equals(Object obj) 
		{
			if(obj == null || getClass() != obj.getClass()) 
			{
				return false;
			}			
			if(obj == this) {
				return true;
			}			
			Employee e = (Employee) obj;			
			return (this.getId() == e.getId() /* && (this.getName() == e.getName()) */);			
		}
		
		@Override
		public String toString() 
		{		
			return "id : "+id +" name : "+name;
		}		
	}
}
