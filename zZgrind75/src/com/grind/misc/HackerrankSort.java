package com.grind.misc;

import java.util.ArrayList;
import java.util.List;

public class HackerrankSort {
	
	
	public static void main(String[] args) 
	{
		StudentInfo s1 = new HackerrankSort().new StudentInfo(0, "Ram0", 3.5);
		StudentInfo s2 = new HackerrankSort().new StudentInfo(1, "Ram1", 3.9);
		StudentInfo s3 = new HackerrankSort().new StudentInfo(2, "Ram2", 3.7);
		StudentInfo s4 = new HackerrankSort().new StudentInfo(3, "Ram3", 3.8);
		
		List<StudentInfo> sList = new ArrayList<>();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);		
		sList.sort((o1, o2) -> {return (o1.getGpa() - o2.getGpa() > 0 ? 1 : -1);});
		
		for(StudentInfo s : sList) {
			System.out.println(s.toString());
		}
	}
	
	public class StudentInfo
	{
		int id;
		String name;
		Double gpa;
		
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
		public Double getGpa() {
			return gpa;
		}
		public void setGpa(Double gpa) {
			this.gpa = gpa;
		}
		
		public StudentInfo(int id, String name, Double gpa) {
			super();
			this.id = id;
			this.name = name;
			this.gpa = gpa;
		}
		
		@Override
		public String toString() {
			return "StudentInfo [id=" + id + ", name=" + name + ", gpa=" + gpa + "]";
		}	
	}

}
