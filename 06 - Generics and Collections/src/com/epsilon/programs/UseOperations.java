package com.epsilon.programs;

import java.util.Date;

import com.epsilon.util.Operations;

public class UseOperations {

	public static void main(String[] args) {
		Operations<Integer> op1 = new Operations<Integer>();
		op1.add(100, 200);
		Operations<String> op2 = new Operations<String>();
		op2.add("Gagan", "B");
		Date d1 = new Date();
		Date d2 = new Date(98, 7, 26); // format: yy-mm-dd 0-jan //Prefered not to use depricated types
		Operations<Date> op3 = new Operations<Date>();
		op3.add(d1, d2);
	}

}
