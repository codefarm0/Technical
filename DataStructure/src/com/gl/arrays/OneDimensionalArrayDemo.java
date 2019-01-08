package com.gl.arrays;

public class OneDimensionalArrayDemo {

	public static void main(String[] args) {
		int[] array;//declaration
		array = new int[10];//instantiation 
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=30;
		array[4]=40;
		array[5]=50;
		System.out.println("Below are the elements of the array - > \n");
		printElements(array);
		
		//declaration, instantiation and initialization in one line
		System.out.println("declaration, instantiation and initialization in one line - > \n");
		int[] array2 = new int[] {1,2,4,5};
		printElements(array2);

		System.out.println(array);//array is an object
		
	}

	private static void printElements(int[] array) {
		
		for(int i : array) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
	}

}
