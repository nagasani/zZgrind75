package com.grind.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompaCoompi implements Comparable<CompaCoompi> {
	
	public int id;
	public String name;
		
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

	public CompaCoompi(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}	
	
	public static void main(String[] args) {
		
		CompaCoompi c1 = new CompaCoompi(1, "Ram");
		CompaCoompi c2 = new CompaCoompi(3, "Raj");
		CompaCoompi c3 = new CompaCoompi(2, "Nag");
		List<CompaCoompi> lst = new ArrayList<>();
		lst.add(c1);
		lst.add(c2);
		lst.add(c3);
		Collections.sort(lst);
		for(CompaCoompi c : lst) {
			System.out.println(c.id + " : " +c.name);
		}
		System.out.println("***********");
		System.out.println("***********");
		System.out.println("***********");
		lst.sort(new Comparator<CompaCoompi>() {
			@Override
			public int compare(CompaCoompi o1, CompaCoompi o2) {
				return o1.name.compareTo(o2.name);
			}
			
		});
		for(CompaCoompi c : lst) {
			System.out.println(c.id + " : " +c.name);
		}
		System.out.println("***********");
		System.out.println("***********");
		System.out.println("***********");
		lst.sort((x1,x2)-> x2.name.compareTo(x1.name));
		for(CompaCoompi c : lst) {
			System.out.println(c.id + " : " +c.name);
		}
	}

	@Override
	public int compareTo(CompaCoompi o) {		
		 return Integer.compare(this.id, o.id);
	}
		
}
