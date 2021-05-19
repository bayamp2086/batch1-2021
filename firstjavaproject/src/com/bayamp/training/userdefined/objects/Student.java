package com.bayamp.training.userdefined.objects;

public class Student {
	//data members
	
	private String firstName=null;
	private String lastName =  null;
	public double gpa  = 0.0;
	private int id = 0;
	private Address address = null;
	
	//default constructor

	public Student(String fname, String lname, double gpa, int id) {
		this.firstName = fname;
		this.lastName = lname;
		this.gpa = gpa;
		this.id = id;
	
	}
	//methods
	//only the methods will have access to the data members 
	//methods/behavior . 
	
	public Student(String fname, String lname, double gpa, int id,Address a) {
		this.firstName = fname;
		this.lastName = lname;
		this.gpa = gpa;
		this.id = id;
		this.address =a;
	}
	
	public void setGPA(double newGPA) {
		
		this.gpa = newGPA;
	}
	
	public void setAddress(Address a) {
		
		this.address = a;
	}
	
}
