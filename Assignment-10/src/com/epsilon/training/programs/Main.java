package com.epsilon.training.programs;

public class Main {
	public static int[] sumOfEvensAndOdds(int []nums) { 
		// do stuff here
		int sume=0;
		int sumo=0;
		int[] arr;
		arr = new int[2];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0)  sume=sume+nums[i];
			else sumo=sumo+nums[i];
		}
		arr[0]=sume;
		arr[1]=sumo;
		return arr;
	}
	public static void main(String[] args) {
		int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		int [] result = sumOfEvensAndOdds(nums);
		System.out.println(result[0]+" " + result[1]);
	}

}
