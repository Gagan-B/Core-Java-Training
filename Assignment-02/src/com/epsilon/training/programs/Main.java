package com.epsilon.training.programs;

public class Main {
	static boolean isValidDate(int year, int month, int day) { 
		// do stuff here 
		int m=0;
		int d=0;
		//int y=0;
		boolean leap;
		if(month>=1 && month<=12) {
			m=1;
		}
        if(m==1) {
			switch (month) {
			case 1: 
				if(day>=1 && day<=31)  d=1;
			    break;
			case 2:
				if(year%4==0) {
					if(year%100==0) {
						if(year%400==0) leap=true;
						else leap=false;
						}
					else leap=true;
				}
				else leap=false;
				if(leap==true) {
					if(day>=1 && day<=29) d=1;
				}
				else {
					if(day>=1 && day<29) d=1;
				}
				break;
			case 3: 
				if(day>=1 && day<=31)  d=1;
			    break;
			case 4: 
				if(day>=1 && day<=30)  d=1;
			    break;
			case 5: 
				if(day>=1 && day<=31)  d=1;
			    break;
			case 6: 
				if(day>=1 && day<=30)  d=1;
			    break;
			case 7: 
				if(day>=1 && day<=31)  d=1;
			    break;
			case 8: 
				if(day>=1 && day<=31)  d=1;
			    break;
			case 9: 
				if(day>=1 && day<=30)  d=1;
			    break;
			case 10: 
				if(day>=1 && day<=31)  d=1;
			    break;
			case 11: 
				if(day>=1 && day<=30)  d=1;
			    break;
			case 12: 
				if(day>=1 && day<=31)  d=1;
			    break;
			}
		}
        
		if(m==1 && d==1) {
			return true;
		}
		else {   
			return false;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(isValidDate(2019, 12, 29));
	}
}
