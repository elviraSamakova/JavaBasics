package com.syntax.class10;

public class Task2Calculate {

	public static void main(String[] args) {
		int[] nums = { 23, 34, 45, 2, 1, 67, 8, 9 };
		int total = 0;

		for (int num : nums) {
			total += num;
			// int sum=nums[0]+nums[1]+nums[2]+nums[3]+nums[4]+nums[5]+nums[6];
		}
		System.out.print(total);

	}

}
