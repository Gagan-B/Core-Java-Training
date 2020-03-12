package com.epsilon.training.programs;

public class Main {
    // Method to compute the prime number 
    // Time Complexity is O(sqrt(N)) 
    static boolean checkPrime(int numberToCheck) 
    { 
        if(numberToCheck == 1) { 
            return false; 
        } 
        for (int i = 2; i*i <= numberToCheck; i++) { 
            if (numberToCheck % i == 0) { 
                return false; 
            } 
        } 
        return true; 
    } 
  
    // Method to iterate the loop from l to r 
    // If prime number detects, sum the value 
    public static int sumOfPrimes(int from, int to) 
    { 
        int sum = 0; 
        for (int i = to; i >= from; i--) { 
  
            // Check for prime 
            boolean isPrime = checkPrime(i); 
            if (isPrime) { 
  
                // Sum the prime number 
                sum = sum + i; 
            } 
        } 
        return sum; 
    } 
    
    
    // Driver code 
    public static void main(String[] args) 
    { 
        // Call the method with l and r 
        System.out.println(sumOfPrimes(4,13)); 
    } 
}
