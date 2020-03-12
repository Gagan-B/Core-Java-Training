package com.epsilon.training.programs;

public class Main {
	public static int fibonacci(int index) {
        if (index <= 1) 
            return index; 
        return fibonacci(index - 1) + fibonacci(index - 2); 
    } 
  
    public static void main(String args[]) 
    {  
        System.out.println(fibonacci(9)); 
    }

}
