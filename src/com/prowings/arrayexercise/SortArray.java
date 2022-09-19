package com.prowings.arrayexercise;

public class SortArray {

	public static int[] printArrayInAscendingOrder(int[] arr) {

		if (arr.length == 0 || arr.length == 1)
			return arr;

		int[] tempArr = new int[arr.length];
		for (int j = 0; j < arr.length; j++) {
			tempArr[j] = arr[j];
		}
		for (int i = 0; i < tempArr.length; i++) {
			for (int k = i + 1; k < arr.length; k++) {
				if(tempArr[i] > tempArr[k]) {
					tempArr[i] += tempArr[k];
					tempArr[k] = tempArr[i] - tempArr[k];
					tempArr[i] -= tempArr[k]; 
				}	
			}
		}
		return tempArr;
	}

	public static int[] printArrayInDescendingOrder(int[] arr) {
		if (arr.length == 0 || arr.length == 1)
			return arr;

		int[] tempArr = new int[arr.length];
		for (int j = 0; j < arr.length; j++) {
			tempArr[j] = arr[j];
		}
		for (int i = 0; i < tempArr.length; i++) {
			for (int k = i + 1; k < arr.length; k++) {
				if(tempArr[i] < tempArr[k]) {
					tempArr[i] += tempArr[k];
					tempArr[k] = tempArr[i] - tempArr[k];
					tempArr[i] -= tempArr[k]; 
				}	
			}
		}
		return tempArr;
	}

	public static void main(String[] args) {

		int[] array1 = {15, 16, 55, 25};
		int[] ascendingArray1 = printArrayInAscendingOrder(array1);
		int[] descendingArray1 = printArrayInDescendingOrder(array1);
		
		System.out.print("original array : ");
		for(int t : array1) {
			System.out.print(t+" ");
		}
		System.out.println();
		
		System.out.print("\narray in ascending order : ");
		for(int i = 0; i < ascendingArray1.length; i++) {
			System.out.print(ascendingArray1[i]+" ");
		}
		System.out.println();
		
		System.out.print("\narray in descending order : ");
		for(int i = 0; i < descendingArray1.length; i++) {
			System.out.print(descendingArray1[i]+" ");
		}
		System.out.println();
	}
}
