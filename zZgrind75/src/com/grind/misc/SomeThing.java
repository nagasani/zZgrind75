package com.grind.misc;

public class SomeThing {

	private int age;
	private String name;
	private boolean isMale;
	
	public SomeThing(int age, String name, boolean isMale) {
		super();
		this.age = age;
		this.name = name;
		this.isMale = isMale;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
}
