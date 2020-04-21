package com.epsilon.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.epsilon.entity.Person;

public class SortPersons {
	public static void main(String[] args) {
		// sorting doesnot happen in set
		List<Person> people = new ArrayList<>();
		people.add(new Person("Gagan", 21, 5.11));
		people.add(new Person("Chaitanya", 22, 6.0));
		people.add(new Person("Gagan", 22, 5.11));
		people.add(new Person("GBG", 23, 5.10));
		people.add(new Person("Manish", 20, 6.2));
		System.out.println("Before sort");
		System.out.println("");
		print(people);
		Collections.sort(people); // sort by natural ordering
		System.out.println("After sort");
		System.out.println("");
		print(people);

		/*Comparator<Person> cmp = new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				//return Double.compare(p2.getHeight(), p1.getHeight()); //descending order
				return Double.compare(p1.getHeight(), p2.getHeight()); //ascending order
			}
		}; // anonymous class = { }; i.e class without name */
		//lambda function of the above commented function
		//Comparator<Person> cmp = (p1, p2) ->  Double.compare(p1.getHeight(), p2.getHeight()); 
		//Collections.sort(people, cmp);   //defining a sort function of our own
		
		//simplification of above 2 lines
		//Collections.sort(people, (p1, p2) ->  Double.compare(p1.getHeight(), p2.getHeight())); 
		
		Collections.sort(people, (p1, p2) -> p1.getAge() - p2.getAge());
		print(people);
	}

	private static void print(List<Person> people) {
		// TODO Auto-generated method stub
		for (Person p : people) {
			System.out.println(p);
		}
		System.out.println("__________________________________________");

	}

}
