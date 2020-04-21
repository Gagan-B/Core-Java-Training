package com.epsilon.programs;

import com.epsilon.entity.Employee;
import com.epsilon.entity.Gender;
import com.epsilon.util.KeyboardUtil;

public class CreateEmployees {

		public static void main(String[] args) throws Exception{
			Employee e1 = new Employee();
			int id=KeyboardUtil.getInt("Enter Id: ");
			e1.setId(id);
			String name = KeyboardUtil.getString("Enter Name: ");
			e1.setName(name);
			int salary = KeyboardUtil.getInt("Enter Salary: ");
			e1.setSalary(salary);
			Gender[] genders= { Gender.FEMALE,Gender.MALE};
			int g = KeyboardUtil.getInt("Enter 0 for Female, 1 for Male: ");
			e1.setGender(genders[g]);
			System.out.println(e1);
			
		}

}
