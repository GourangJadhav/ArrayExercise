package com.prowings.arrayexercise;

import java.util.Arrays;

public class CompareTwoArrays {

//	using java.util.Arrays class method equals().
	public static void compareTwoArrays(int[] arr1, int[] arr2) {

		if (arr1.length != arr2.length) {
			System.out.println("arr1 and arr2 are not same");
		}
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("arr1 and arr2 are same");
		} else {
			System.out.println("arr1 and arr2 are not same");
		}
	}

	public static boolean isTwoArraysSame(int[] arr1, int[] arr2) {
		
		if(arr1.length != arr2.length)return false;
		int sum1 = 0, sum2 =0;
		for(int i = 0; i < arr1.length; i++) {
			sum1 += arr1[i];
			sum2 += arr2[i];
		}
		return sum1 == sum2 ? true : false; 
	}

	public static void main(String[] args) {

		int[] arr1 = { 9, 7, 7, 8, 8 };
		int[] arr2 = { 2, 2, 2, 2, 2 };

		compareTwoArrays(arr1, arr2);
		
		boolean result = isTwoArraysSame(arr1, arr2);
		if(result) {
			System.out.println("arr1 and arr2 are same");
		}else {
			System.out.println("arr1 and arr2 are not same");
		}
	}
}
