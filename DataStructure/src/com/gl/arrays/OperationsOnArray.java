package com.gl.arrays;

/**
 * 
 * @author Arvind
 * 
 * Arrays are passed by reference
 *
 */
public class OperationsOnArray {

	public static void main(String[] args) {
		int array[] = new int [] {1,2,3,4,5};
		
		System.out.println("Print initial array -->");
		
		printArrayELements(array);
		
		System.out.println("------------------removing elements from array---------------------");
		removeElementFromArray(array, 2);
		System.out.println("After removing particular element, elements of the array -->");
		printArrayELements(array);
		
		System.out.println("------------------Adding elements into array---------------------");
		addELementIntoArray(array, 200);
		System.out.println("After adding particular element, elements of the array -->");
		printArrayELements(array);

	}

	/**
	 * Adds element into the array
	 * @param array
	 * @param elementToAdd
	 */
	private static void addELementIntoArray(int[] array, int elementToAdd) {
		int length = array.length;
		boolean flag = false;
		for(int i = 0; i< length; i++) {
			if(array[i]==0) {
				array[i]=elementToAdd;
				flag=true;
				System.out.println("Element added at index - " + i + " \n");
				break;
			}
		}
		
		if(!flag) {
			System.out.println("There is no more space to add elements\n");
		}
		
	}

	/**
	 * If the specified element is present in the array then removes it from the array
	 * @param array
	 * @param elementToRemove
	 */
	private static void removeElementFromArray(int[] array, int elementToRemove) {
		
		int length = array.length;
		boolean flag = false;
		for(int i = 0; i< length; i++) {
			if(array[i]==elementToRemove) {
				array[i]=0;
				flag=true;
				System.out.println("Element found at index - " + i + " and removed from array \n");
				break;
			}
		}
		
		if(!flag) {
			System.out.println("ELement to remove is not present in the array\n");
		}
		
	}

	/**
	 * Prints the elements of array
	 * @param array
	 */
	private static void printArrayELements(int[] array) {
		for(int element : array) {
			System.out.print(element + ", ");
		}
		System.out.println("");
		
	}

}
