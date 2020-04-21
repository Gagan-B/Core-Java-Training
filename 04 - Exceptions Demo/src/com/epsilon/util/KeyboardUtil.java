package com.epsilon.util;

import java.util.Scanner;
@SuppressWarnings("resource") //blocks the warning occurring due to resource leak
public class KeyboardUtil {

	public KeyboardUtil() {

	}

	public static String getString(String message) {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	public static int getInt(String message) {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

}
