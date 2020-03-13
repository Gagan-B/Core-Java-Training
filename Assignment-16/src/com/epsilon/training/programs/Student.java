package com.epsilon.training.programs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString


public class Student extends Person {
	
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String address, String program, int year,double fee) {
		super(name, address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}

}
