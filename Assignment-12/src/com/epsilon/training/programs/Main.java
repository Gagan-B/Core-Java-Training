package com.epsilon.training.programs;

public class Main {
	
	static String[] one_digit= { "one","two","three","four","five","six","seven","eight","nine"};
	static String[] teens= {"eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	static String[] two_digit= { "ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	
	public static String tens(int num) {
		String number="";
		if(num%10==0) {
			number=number+two_digit[(num/10)-1];
		}
		else if(num/10==1){
			number=number+teens[(num%10)-1];
		}
		else {
			number=number+two_digit[(num/10)-1]+" "+one_digit[(num%10)-1];
		}
		return number;
	}
	public static String hundreds(int num) {
		String number="";
		if((num/10)%10==0) {
			number=number+one_digit[(num/100)-1]+" hundred and " + one_digit[(num%100)-1];
		}
		else {
			number=number+one_digit[(num/100)-1]+" hundred and " + tens(num%100);
		}
		return number;
	}
	public static String thousands(int num) {
		String number="";
		if(((num/100)%10==0)) {
			if((num/10)%10==0)  number=number+one_digit[(num/1000)-1]+" thousand "+one_digit[(num%10)-1];
		    else   number=number+one_digit[(num/1000)-1]+" thousand "+tens(num%100);
		}
		else {
			number=number+one_digit[(num/1000)-1]+" thousand "+hundreds(num%1000);
		}
		return number;
	}
	public static String ten_thousands(int num) {
		String number="";
		if((num/100)%10==0) { 
			if((num/10)%10!=0)  number=number+tens(num/1000)+" thousand "+tens(num%100);
			else  number=number+tens(num/1000)+" thousand "+one_digit[(num%10)-1];
		}
		else {
			number=number+tens(num/1000)+" thousand "+hundreds(num%1000);
		}
		return number;
	}
	
	public static String inWords(int num) { 
		// do stuff here
		String number="";
		char[] chars = ("" + num).toCharArray();
		int len=chars.length;
		switch(len)
		{
			case 1: 
				number=number+one_digit[num-1];
				break;
			case 2:
				number=number+tens(num);
				break;
			case 3:
				number=number+hundreds(num);
				break;
			case 4:
				number=number+thousands(num);
				break;
			case 5:
				number=number+ten_thousands(num);
				break;
				
				
		}
		return number; 
	}
	
	public static void main(String[] args) {
		System.out.println(inWords(12345));
		// should return "twelve thousand three hundred forty five"
		//inWords(10203040);
		// should return "one crore two lakh three thousand forty"
		System.out.println(inWords(101));
		// should return "one hundred one"
	}

}
