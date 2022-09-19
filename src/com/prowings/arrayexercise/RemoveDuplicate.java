package com.prowings.arrayexercise;

public class RemoveDuplicate {

	static int[] removeDuplicateNumInArray(int[] arr) {
		if (arr.length == 0 || arr.length == 1) {
			return arr;
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = 0;
				}
			}
		}
		int[] tempArr = new int[arr.length];
		for (int k = 0; k < tempArr.length; k++) {
			if (arr[k] != 0) {
				tempArr[k] = arr[k];
			}
		}
		return tempArr;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 2, 4, 5, 6, 3, 5, 1 };
		int[] uniqueNumsArray = removeDuplicateNumInArray(nums);
		for (int i = 0; i < nums.length; i++) {
			if (uniqueNumsArray[i] != 0) {
				System.out.print(uniqueNumsArray[i] + " ");
			}
		}
	}
	
}
