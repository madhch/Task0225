package org.practice;

public class PersonalInfo {

	String lastName = "null";
	String firstName = "null";
	long dob= 50;
	//Parameterized constructor
	public PersonalInfo(String lastName, String firstName, long dob) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.dob = dob;
	}
	//Overriding in superclass
	public int bankAccount(int x) {
		return x;	
	}
	//constructor
	public PersonalInfo() {
	}
	public void printDetails(){
		System.out.println(lastName+firstName + "DOB::"+dob);
	}
}

