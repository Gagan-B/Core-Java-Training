package com.epsilon.training.programs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Staff extends Person {
	
	private String school;
	private double pay;
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school=school;
		this.pay=pay;
	}
	
	

}
