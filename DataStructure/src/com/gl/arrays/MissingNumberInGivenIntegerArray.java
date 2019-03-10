package com.gl.arrays;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumberInGivenIntegerArray {

	public static void main(String[] args) {
		Integer arr[]= {3,1,4,2,5,7};
		missinNumberSolutionType1(arr);
		missingNumberSolutionType2(arr);
		missingNumberSolutionType3(arr,10);

	}
	
	//type - 1
	static void missinNumberSolutionType1(Integer arr[]) {
		int n = arr.length+1;//adding 1 as there is one number missing
		int expectedTotal = n * (n+1)/2;
		int actualTotal = Arrays.asList(arr).stream().mapToInt(i -> i.intValue()).sum();
		System.out.println("(Type-1)missing number - " + (expectedTotal-actualTotal));
	}
	
	//type -2
	static void missingNumberSolutionType2(Integer arr[]) {
		Arrays.parallelSort(arr);
		for(int i=0; i< arr.length-1; i++) {
			if(arr[i+1] != arr[i]+1) {
				System.out.println("(Type-2)Missing number - " + (arr[i]+1));
			}
		}
	}
	
	//type-3
	// works even if there are more than one missing elements
	static void missingNumberSolutionType3(Integer arr[], int totalNumbers) {
		int totalMissingNumbers = totalNumbers - arr.length;
		BitSet bitS = new BitSet(totalNumbers);
		for(int i: arr) {
			bitS.set(i-1);
		}
		
		int lastMisIndex = 0;
		System.out.print("(Type-3) Missing numbers - ");
		for(int i =0; i< totalMissingNumbers; i++) {
			lastMisIndex = bitS.nextClearBit(lastMisIndex);
			System.out.print(++lastMisIndex +", ");
		}
		System.out.println();
	}

}
