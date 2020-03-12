package com.epsilon.training.programs;

public class Main {
	public static void sortThreeNumbers(int a, int b, int c) { 
		// do stuff here
		if(a<b) {
			if(b<c) {
				System.out.println(a + " " + b + " "+ c);
			}
			else {
				if(a<c) {
					System.out.println(a + " " + c + " "+ b);
				}
				else {
					System.out.println(c + " " + a + " "+ b);
				}
			}
		}
		else {
			if(a<c) {
				System.out.println(b + " " + a + " "+ c);
			}
			else {
				if(b<c) {
					System.out.println(b + " " + c + " "+ a);
				}
				else {
					System.out.println(c + " " + b + " "+ a);
				}
			}
		}
	}
	public static void main(String[] args) {
		sortThreeNumbers(2,10,1);
		sortThreeNumbers(20,10,1);
		sortThreeNumbers(2,10,100);
	}

}
