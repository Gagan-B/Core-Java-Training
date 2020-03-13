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
	public static void printCalendar(String str) {
		/// do stuff here
		String[] split = str.split("-");
		int year= Integer.parseInt(split[0]);
		int month= Integer.parseInt(split[1]);
		//System.out.println(year);
		int[][] arr;
		arr=new int[5][7];
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
			for(int i=0;i<w;i++) {
				arr[0][i]=0;
			}
			int j=0;
			for(int i=1;i<=d;i++) {
				if(e==7) {
					j=j+1;
					e=0;
				}
				arr[j][e]=i;
				e++;
			}
			System.out.println("{ ");
			for(int x=0;x<5;x++) {
				System.out.print(" { ");
				for(int z=0;z<7;z++) {
					if(arr[x][z]<10) {
						System.out.print(" " + arr[x][z]);
					}
					else
					{
						System.out.print(arr[x][z]);
					}
					if(z!=6) {
						System.out.print(", ");
					}
				}
				System.out.print(" }");
				if(x!=4) {
					System.out.print(", ");
			    }
				System.out.println("");
			}
			System.out.print("}");
		}
		else {
			System.out.println("Invalid month");
		}
		
	}
	public static void main(String[] args) {
		printCalendar("2018-02");
	}

}
