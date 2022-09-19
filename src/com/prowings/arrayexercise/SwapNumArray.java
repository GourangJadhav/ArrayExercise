package com.prowings.arrayexercise;

public class SwapNumArray {

	public static int[] swapNumInArray(int[] arr) {

		if (arr.length == 0 || arr.length == 1) {
			System.out.println("array length is less than 1 ");
		}
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}

		for (int j = 1; j < arr.length; j++) {
			temp[j] = temp[j] + temp[j - 1];
			temp[j - 1] = temp[j] - temp[j - 1];
			temp[j] = temp[j] - temp[j - 1];
			j = j + 1;
		}
		return temp;
		
	}

	public static void swapNumInTwoArrays(int[] arr1, int[] arr2) {

		if (arr1.length == 0 || arr1.length == 1 && arr2.length == 0 || arr2.length == 1) {
			System.out.println("array1 or array2 length is 1 or 0");
		}

		if (arr1.length != arr2.length) {
			System.out.println("\n\tarr1 and arr2 length not same");
			return;
		}
		
		int[] fristArr = new int[arr1.length];
		int[] secoundArr = new int[arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			fristArr[i] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			secoundArr[i] = arr2[i];
		}

		for (int i = 0; i < fristArr.length; i++) {
			fristArr[i] += secoundArr[i];
			secoundArr[i] = fristArr[i] - secoundArr[i];
			fristArr[i] -= secoundArr[i];
		}

		System.out.println("after swap two array's");
		System.out.print("array 1 : ");
		for (int ele : fristArr) {
			System.out.print(ele + " ");
		}
		System.out.println();
		System.out.print("array 2 : ");
		for (int ele : secoundArr) {
			System.out.print(ele + " ");
		}
	}

	public static void main(String[] args) {
		int[] nums1 = { 10, 20, 30, 40 };
		int[] nums2 = { 15, 25, 35, 45,55};
		int[] nums3 = { 30, 60, 80, 100 };

		int[] swapAfterNums1 = swapNumInArray(nums1);

		
		System.out.println("before Swap single array :");
		for (int num : nums1) {
			System.out.print(num + " ");
		}
		System.out.println();

		System.out.println("after swap single array :");
		for (int num : swapAfterNums1) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println("before swap two array's");
		System.out.print("array 1 : ");
		for (int num : nums2) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.print("array 2 : ");
		for (int num : nums3) {
			System.out.print(num + " ");
		}

		System.out.println();
		
		swapNumInTwoArrays(nums2, nums3);

	}

}
