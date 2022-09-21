package com.prowings.arrayexercise;

public class ConcateTwoArrays {

	public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

		if (arr1.length == 0)
			return arr1;
		if (arr2.length == 0)
			return arr2;

		int totalArrLength = arr1.length + arr2.length;

		int[] tempArr = new int[totalArrLength];
		int addToIndex = 0;
		for (int num : arr1) {
			tempArr[addToIndex] = num;
			addToIndex++;
		}
		for (int num : arr2) {
			tempArr[addToIndex] = num;
			addToIndex++;
		}
		return tempArr;
	}

	public static void main(String[] args) {
		int[] nums1 = {};
		int[] nums2 = { 50, 60, 70, 80 };

		int[] newArray = concatTwoArrays(nums1, nums2);

		System.out.println("two Array's : ");
		for (int num : nums1) {
			System.out.print(num + " ");
		}
		System.out.println();

		for (int num : nums2) {
			System.out.print(num + " ");
		}
		System.out.println();

		if (newArray.length != 0) {
			System.out.println("concatenate two array's :");
			for (int num : newArray) {
				System.out.print(num + " ");
			}
		}
		else {
			System.out.println(" Array elements are 0, sorry so no concate two array ");
		}
		System.out.println();
	}
}
