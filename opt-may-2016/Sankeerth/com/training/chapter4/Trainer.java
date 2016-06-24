package com.training.chapter4;

public class Trainer {
	
	private String TrainerName;
	private String TrainerCourse;
	private String TrainerID;
	Trainer(String name, String course,String id){
		TrainerName = name;
		TrainerCourse = course;
		TrainerID = id;
	}
	
	public void setTrainerName(String name){
		TrainerName = name;
	}
	public void setTrainerCourse(String course){
		TrainerCourse = course;
	}
	public void setTrainerID(String id){
		TrainerID = id;
	}
	public String getTrainerName(){
		return TrainerName;
	}
	public String getTrainerCourse(){
		return TrainerCourse;
	}
	public String getTrainerID(){
		return TrainerID;
	}

}
