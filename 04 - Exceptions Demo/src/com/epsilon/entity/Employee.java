package com.epsilon.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class Employee {
	private int id;
	private String name;
	private double salary;
	private Gender gender;

	// source -> generate constructor using fields -> select all
	public Employee(int id, String name, double salary, Gender gender)
			throws InvalidIdException, InvalidNameException, InvalidSalaryException {
		super();
		setId(id);
		setName(name);
		setSalary(salary);
		setGender(gender);
	}

	public void setId(int id) throws InvalidIdException {
		if (id < 1) {
			throw new InvalidIdException("Id must be >=1");
		}
		this.id = id;
	}

	public void setName(String name) throws InvalidNameException {
		if (name == null || name.trim().length() < 3) {
			throw new InvalidNameException("Name must contain 3 or more letters");
		}
		this.name = name;
	}

	public void setSalary(double salary) throws InvalidSalaryException {
		this.salary = salary;
		if (salary < 20000) {
			throw new InvalidSalaryException("Salary must be >= Rs.20000");
		}
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
