package com.epsilon.programs;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.epsilon.entity.Person;

public class SetDemo {

	public static void main1(String[] args) {

//		Set<Integer> nums = new HashSet<>();   //No order maintained
		Set<Integer> nums = new TreeSet<Integer>(); // order maintained
		nums.add(12); // auto boxing
		nums.add(5);
		nums.add(12);
		nums.add(5);
		nums.add(12);
		nums.add(5);
		nums.add(12);
		nums.add(22);
		System.out.println("num.size = " + nums.size());
		System.out.println(nums);

		/*
		 * int x = 100; Integer y; int z; // boxing -> has to be explicit y = new
		 * Integer(x); // unboxing -> has to be explicit z = y.intValue();
		 */

		//Set<String> names = new HashSet<String>();
		// hash number gets generated for the names thus their random order remains the
		// same irrespective of repetitions
		
		Set<String> names = new TreeSet<String>();
		names.add("Gagan");
		names.add("Pradeep");
		names.add("Vanitha");
		names.add("Chandru");
		names.add("Manju");
		names.add("Gagan");
		System.out.println(names);

	}
	
	public static void main2(String[] args) {
		Set<Person> people = new HashSet<>();
		people.add(new Person("Gagan",21,5.11));
		people.add(new Person("Chaitanya",22,6.0));
		people.add(new Person("Gagan",22,5.11)); //Any one value change, it will be added by hashset
		people.add(new Person("GBG",23,5.10));
		people.add(new Person("Manish",20,6.2));
		
		for(Person p: people) {
			System.out.println(p);
		}
		
	}
	
	public static void main(String[] args) {
		Set<Person> people = new TreeSet<>();
		people.add(new Person("Gagan",21,5.11));
		people.add(new Person("Chaitanya",22,6.0));
		people.add(new Person("Gagan",22,5.11)); //Any one value change, it will be added by hashset
		people.add(new Person("GBG",23,5.10));
		people.add(new Person("Manish",20,6.2));
		
		for(Person p: people) {
			System.out.println(p);
		}
		
	}
}
