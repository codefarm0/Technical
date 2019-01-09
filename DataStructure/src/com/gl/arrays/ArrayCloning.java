package com.gl.arrays;

/**
 * 
 * @author Arvind
 * 
 * its always deep cloning for first level of elements
 * So in case of multidimensional arrays elements of subarrays are shared
 *
 */
public class ArrayCloning {

	public static void main(String[] args) {
		int[] array1 = new int[] {1,2,3,4};
		int[] clonedArray1 = array1.clone();
		
		System.out.println("array1 == clonedArray1 >> " + (array1 == clonedArray1));
		
		System.out.println("-------2-D array----------");
		int[][] twoDimeArray1 = new int[][]{ 
			{1,2,3,4},
			{10,20,30,40}
			};
			
		int[][] clonedTwoDimeArray1 = twoDimeArray1.clone();
		
		System.out.println("twoDimeArray1 == clonedTwoDimeArray1 >> " + (twoDimeArray1 == clonedTwoDimeArray1));
		System.out.println("twoDimeArray1[0] == clonedTwoDimeArray1[0] -> " + (twoDimeArray1[0] == clonedTwoDimeArray1[0]));
		System.out.println("twoDimeArray1[1] == clonedTwoDimeArray1[1] -> " + (twoDimeArray1[1] == clonedTwoDimeArray1[0]));

	}

}
