package com.epsilon.training.programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int sum=0;
		int in=0;
		ArrayList<String> str_arr = new ArrayList<String>();
		ArrayList<Integer> int_arr = new ArrayList<Integer>();
		while(true) {
			try {
				System.out.print("Enter the input (If you want to exit, enter NO): ");
				Scanner sc = new Scanner(System.in);
				String text= sc.nextLine();
				in=in+1;
				System.out.println("");
				if((text.toLowerCase()).equals("no")) {
					break;
				}
				str_arr.add(text);
				int cnt=Integer.parseInt(text);
				str_arr.remove(str_arr.size()-1);
				int_arr.add(cnt);
				sum=sum+cnt;
			} catch (NumberFormatException e) {
			}
		}
		System.out.println("Number of inputs = " + in);
		System.out.println("Number of integer inputs = " + int_arr.size());
		System.out.println("Number of non-integer inputs = " + str_arr.size());
		System.out.println("Sum of all integer inputs = " + sum);
		System.out.println("The integer inputs = " + int_arr);
		System.out.println("The non-integer inputs = " + str_arr);
	}

}
