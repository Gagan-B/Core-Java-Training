package com.epsilon.training.programs;

import com.epsilon.training.entity.Customer;

public class CreateCustomer {
	public static void main(String[] args) {
		//variable declaration
		//c1 is a reference type variable
		//c1 gets 8 bytes in the stack
		//At this time, the class Customer is not loaded to VM yet!
		Customer c1;
		//For this statement to work, the class Customer must be loaded into the VM
		//A class is loaded only once, and once loaded, stays in the VM for ever
		//The “new” keyword allocates memory required by the customer object (sum of
		//bytes required by the fields of customer class). Once the allocation is done,
		//it calls the constructor specified. It records the actual address against a 
		//reference number,  and returns the reference number, which is then collected 
		//and stored by by c1
		c1=new Customer();
		c1.setId(1);
		c1.setName("Gagan B");
		c1.setEmail("gagan.b@epsilon.com");
		c1.setPhone("9008734075");
		System.out.println(c1);

	}

}
