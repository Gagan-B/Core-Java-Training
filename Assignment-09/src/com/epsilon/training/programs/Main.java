package com.epsilon.training.programs;

public class Main {
	
	public static boolean is_leap_year(int year) {
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) return true;
				else return false;
				}
			else return true;
		}
		else return false;
	}
	public static int check_month(int month) {
		if(month>=1 && month<=12) {
			return 1;
		}
		else return 0;
	}
	public static int day(int date, int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (date + x + (31*m)/12) % 7;
        return d;
    }
	public static void printCalendar(int month, int year) {
		/// do stuff here
		if(check_month(month)==1) {
			int d=0;
			if(month==2) {
				if(is_leap_year(year)==true) {
					d=29;
				}
				else d=28;
			}
			else if((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12))  d=31;
			else d=30;
			
			int w=day(1,month,year);
			int e=w;
			System.out.println("Su   Mo   Tu   We   Th   Fr   Sa   ");
			for(int i=0;i<w;i++) {
				System.out.print("     ");
			}
			for(int i=1;i<=d;i++) {
				if(e==7) {
					System.out.println("");
					e=0;
				}
				System.out.printf("%2d   ",i);
				e++;
			}
			
		}
		else {
			System.out.println("Invalid month");
		}
		
	}
	public static void main(String[] args) {
		printCalendar(8,2018);
	}

}
