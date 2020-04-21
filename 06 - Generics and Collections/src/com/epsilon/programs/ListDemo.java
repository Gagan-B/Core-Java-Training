package com.epsilon.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		//List<String> names = new ArrayList<>();
		List<String> names = new LinkedList<>();
		names.add("Gagan");
		names.add("Pradeep");
		names.add("Vanitha");
		names.add(1,"Chandru");
		names.add("Manju");
		Collections.sort(names);
		System.out.println(names);
		names.remove("Manju");
		System.out.println(names);
        for(String name: names) {
        	System.out.println(name);
        }
	}

}
