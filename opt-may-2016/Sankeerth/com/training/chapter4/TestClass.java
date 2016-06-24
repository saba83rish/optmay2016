package com.training.chapter4;

public class TestClass {

	public static void main(String[] args) {
		
		Car c1 = new Car("Aston Martin", "DB5", "JB007");
		c1.setCarMake("Aston Martin");
		c1.setCarName("DB5");
		c1.setRegistrationNumber("JB007");
		
		String s1 = c1.getCarMake();
		String s2 = c1.getCarName();
		String s3 = c1.getRegistrationNumber();
		
		System.out.println("-------Car Details---------");
		System.out.println("Car is made by " + s1);
		System.out.println("Model " + s2);
		System.out.println("Registration Number: " + s3);
		
		Employee e1 = new Employee("Satyna Nadella", "MS81967", "CEO");
		e1.setEmployeeName("Satya Nadella");
		e1.setEmployeeNumber("MS81967");
		e1.setEmployeeStatus("CEO");
		
		String se1 = e1.getEmployeeName();
		String se2 = e1.getEmployeeNumber();
		String se3 = e1.getEmployeeStatus();
		

		System.out.println("\n-----Employee Details------");
		System.out.println("Name of the employee: " + se1);
		System.out.println("ID: " + se2);
		System.out.println("Designation: " + se3);
		
		Trainer t1 = new Trainer("Mr.Wright", "Information Security", "HU786");
		t1.setTrainerName("Mr.Wright");
		t1.setTrainerCourse("Information Security");
		t1.setTrainerID("HU786");
		
		String st1 = t1.getTrainerName();
		String st2 = t1.getTrainerCourse();
		String st3 = t1.getTrainerID();

		System.out.println("\n-----Trainer Details------");
		System.out.println("Name of the Trainer: " + st1);
		System.out.println("Course: " + st2);
		System.out.println("Trainer ID: " + st3);
		
		Student x1 = new Student("Sankeerth", "007", "Java");
		x1.setStudentName("Sankeerth");
		x1.setStudentID("007");
		x1.setStudentCourse("Java");
		
		String ss1 = x1.getStudentName();
		String ss2 = x1.getStudentID();
		String ss3 = x1.getStudentCourse();
		
		System.out.println("\n-----Student Details------");
		System.out.println("Name of the Student: " + ss1);
		System.out.println("Student ID: " + ss2);
		System.out.println("Course: " + ss3);

	}

}
