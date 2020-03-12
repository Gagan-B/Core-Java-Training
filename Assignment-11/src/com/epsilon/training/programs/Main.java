package com.epsilon.training.programs;

public class Main {

	public static String reverseByWords(String sentence) {
		// do stuff here
		String[] words = sentence.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[(words.length)-1-i]; 
     		   reversedString = reversedString + word + " ";
		}
		return reversedString;
	}

	public static void main(String[] args) {
		String out = reverseByWords("my name is vinod and i live in bangalore");
		System.out.println(out);

	}

}
