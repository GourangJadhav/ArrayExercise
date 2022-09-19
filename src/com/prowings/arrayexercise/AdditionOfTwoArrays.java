package com.prowings.arrayexercise;

public class AdditionOfTwoArrays {

	public static int[] addTwoArrays(int[] arr1, int[] arr2) {

		if (arr1.length == 0)
			return arr1;
		if (arr2.length == 0)
			return arr2;

		if(arr1.length == arr2.length) {
			int[] tempArr = new int[arr1.length];
			for (int i = 0; i < tempArr.length; i++) {
				tempArr[i] = arr1[i] + arr2[i];
			}
			return tempArr;
		} else {
			return arr1;
		}
	}

	public static void main(String[] args) {

		int[] array1 = { 5, 15, 25, 35, 45 };
		int[] array2 = { 10, 20, 30, 40, 50 };

		int[] sumOfTwoArrays = addTwoArrays(array1, array2);

		System.out.println("two array's are : ");
		for (int num : array1) {
			System.out.print(num + " ");
		}
		System.out.println();

		for (int num : array2) {
			System.out.print(num + " ");
		}
		System.out.println();

		System.out.println("Additon of two array :");
		for (int num : sumOfTwoArrays) {
			System.out.print(num + " ");
		}
	}
}
