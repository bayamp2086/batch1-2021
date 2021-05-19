package com.bayamp.training.userdefined.objects.programs;

import com.bayamp.training.userdefined.objects.Student;

import com.bayamp.training.userdefined.objects.Address;

public class MyStudentProgram {

	public static void main(String[] args) {
	
		//Create of CRUD operation
		String firstNameOfStudent1 = new String("rajitha");
		Address bayAmpHeadQuarterAddress = new Address("2086 #c1","Walsh Ave", "CA","Santa Clara",95050);
		
		Student student1 = new Student(firstNameOfStudent1,"lastname1",3.52,1234,bayAmpHeadQuarterAddress);
		
		
		Address fremontAddress = new Address("777 Apt#101","Fremont Ave", "CA","Fremont",94415);
		
		//Create of CRUD operation
		Student student2 = new Student("meghana","lastname2",3.50,1235);
	
		//UPDATE OPERATION OF CRUD
		student2.setGPA(3.51);
		
		student1.setAddress(fremontAddress);
		
		//Read OPERATAIONS OF CRUD FOR student1 and student2
		

	}

}
