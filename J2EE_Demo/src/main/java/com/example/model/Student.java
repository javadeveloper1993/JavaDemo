package com.example.model;

public class Student {

	private String firstName;
	private String middelName;
	private String lastName;
	private int age;

	public Student() {
		super();
		System.out.println(" >>>>> Student() Init : " + this.hashCode());
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println(" >>>>>>> In Set First Name : " + firstName);
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println(" >>>>>>> In Set Last Name : " + lastName);
		this.lastName = lastName;
	}

	public String getMiddelName() {
		return middelName;
	}

	public void setMiddelName(String middelName) {
		System.out.println(" >>>>>>> In Set Middel Name : " + middelName);
		this.middelName = middelName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println(" >>>>>>> In Set Age Name : " + age);
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", middelName=" + middelName
				+ ", lastName=" + lastName + ", age=" + age + "]";
	}

}
