package com.epsilon.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromKeyboard {

	public static void main1(String[] args) throws IOException {
		//keyboard->system.in
		System.out.print("Enter your name: ");
		/*int ch = System.in.read();
		System.out.println(ch);
		ch = System.in.read();
		System.out.println(ch);
		ch = System.in.read();
		System.out.println(ch);
		ch = System.in.read();
		System.out.println(ch);*/
		int ch;
		String name = "";
		while((ch = System.in.read()) != '\n') {
			name += (char) ch;
		}
		System.out.println("Hello " + name);
	}
	 public static void main2(String[] args) throws Exception {
		 System.out.print("Enter your name: ");
		 byte[] bytes = new byte[120];
		 System.in.read(bytes);
		 String name = new String(bytes).trim(); //removes the next line and the white spaces
		 System.out.println("-->" + name + "<--");
	}
    public static void main(String[] args) throws Exception {
		System.out.println("Enter your name: ");
		//convert System.in (which is an InputStream) into a Reader object
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		String name = in.readLine();
		System.out.println("Hello " + name + " !");
		
	}
}
