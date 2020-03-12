package com.epsilon.training.programs;

public class Main {
	static int fact(int num) {
		if(num==0) {
			return 1;
		}
		else if(num==1) {
			return 1;
		}
		else {
			return num*fact(num-1);
		}
	}
	public static double sine(double angle) {
		double val=0;
		double temp;
		double x1=angle;
		//int y1=1;
		for(int i=0;i<5;i++) {
			temp=x1/fact((2*i)+1);
			if(i%2==0) {
				val=val+temp;
			}
			else {
				val=val-temp;
			}
			x1=x1*angle*angle;
		}
		return val;
	}
	public static void main(String[] args) {
		System.out.println(sine(3));
	}

}
