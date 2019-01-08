package com.gl.arrays;
/**
 * 
 * Arrays are passed by reference
 *
 */

public class MultidimensionalArrayDemo {

	public static void main(String[] args) {
		showTwoDimensionalArray();
		//showThreeDimensionalArray();

	}

	/**
	 * This method explains about 2-D array
	 */
	private static void showTwoDimensionalArray() {
		
		String[][] twoDimeArray2 = new String[3][3];//array declaration as well as memory allocation
		
		twoDimeArray2[0][0] = "Fruits";
		twoDimeArray2[0][1] = "Flowers";
		twoDimeArray2[0][2] = "Vegetables";
		
		printELements(twoDimeArray2);
		
		String[][] twoDimeArray = new String[][]{
				{"Fruits","mango","apple","guava"},
				{"Flowers","rose","lotus","kevada"},
				{"Vegetables","cabage","peas","carrot"}
		};
		
		printElementsOf2Darray(twoDimeArray);
		
		
		
	}
	
	private static void printELements(String[][] twoDimeArray2) {
		for(int i= 0; i<3; i++) {
			for(int j=0;j<3;j++) {
				System.out.println(twoDimeArray2[i][j] + ", ");
			}
			System.out.println();
		}
		
	}

	private static void printElementsOf2Darray(String[][] twoDimeArray) {
		System.out.println("Length of the array -> " + twoDimeArray.length);
		for(String[] elements : twoDimeArray) {
			for(String element : elements) {
				System.out.print(element + ", ");
			}
			System.out.println();
		}
		
	}

	/**
	 * This method explains about 3-D array
	 */
	private static void showThreeDimensionalArray() {
		String[][][] threeDimArray1 = new String[3][3][3];//array declaration as well as memory allocation
		
		threeDimArray1[0][0][0] = "Fruits";
		threeDimArray1[0][0][1] = "Flowers";
		threeDimArray1[0][0][2] = "Vegetables";
		
		String[][][] threeDimArray2 = new String[][][]{
			{
				{"Fruits","mango","apple","guava"},
				{"Flowers","rose","lotus","kevada"},
				{"Vegetables","cabage","peas","carrot"}
			},
			{
				{"profession", "government", "non-govenrment"},
				{"country", "India", "USA"}
			},
			{
				{"states", "UP", "Delhi"},
				{"cities", "Noida", "Pune"}
			}
		};
		
		printElementsOf3Darray(threeDimArray2);
		
	}

	private static void printElementsOf3Darray(String[][][] threeDimArray2) {
		System.out.println("Length of the array -> " + threeDimArray2.length);
		for(String[][] twoDArray : threeDimArray2) {
		for(String[] oneDarray : twoDArray) {
			for(String element : oneDarray) {
				System.out.print(element + ", ");
			}
			System.out.println();
		}
		}
	}

}
