package com.epsilon.training.programs;

public class Main {
	static boolean isPrimeNumber(int num) { 
		// do stuff here
		boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for non prime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            return true;
        else
		    return false; 
	}
    public static void main(String[] args) {
    	System.out.println("2 is a prime number?"+ isPrimeNumber(2));
    	System.out.println("7 is a prime number?"+ isPrimeNumber(7));
    	System.out.println("14 is a prime number?"+ isPrimeNumber(14));
    	System.out.println("15 is a prime number?"+ isPrimeNumber(15));
    }
}
