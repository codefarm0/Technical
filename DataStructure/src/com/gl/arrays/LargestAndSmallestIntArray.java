package com.gl.arrays;

import java.util.Arrays;

public class LargestAndSmallestIntArray {

	public static void main(String[] args) {
		smallestLargest(new int[] {1000,3,45,1,4,3,56,7,343,263,6});

	}
	
	static void smallestLargest(int arr[]) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(num < min) {
				min = num;
			}
			
			if(num > max) {
				max = num;
			}
		}
		System.out.println("Given array : " + Arrays.toString(arr));
		System.out.println("Smallest : " + min + ", largest : " +max);
	}

}
