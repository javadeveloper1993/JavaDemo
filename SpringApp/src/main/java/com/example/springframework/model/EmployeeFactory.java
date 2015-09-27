package com.example.springframework.model;


/**
 * @author Maulik
 */
public class EmployeeFactory {

	public static Employee getStaticEmployeeObject() {
		Employee employee = new Employee();
		return employee;
	}

	public Employee getEmployeeObject() {
		Employee employee = new Employee();
		return employee;
	}

}
