package com.training.chapter4;

public class Student {

	private String StudentName;
	private String StudentID;
	private String StudentCourse;
	
	Student(String name, String id, String course){
		StudentName = name;
		StudentID = id;
		StudentCourse = course;
	}
	
	public void setStudentName(String name){
		StudentName = name;
	}
	public void setStudentID(String id){
		StudentID = id;
	}
	public void setStudentCourse(String course){
		StudentCourse = course;
	}
	
	public String getStudentName(){
		return StudentName;
	}
	public String getStudentCourse(){
		return StudentCourse;
	}
	public String getStudentID(){
		return StudentID;
	}
}
