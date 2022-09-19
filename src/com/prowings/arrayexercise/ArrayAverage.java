package com.prowings.arrayexercise;

public class ArrayAverage {

	public static double getMarksAverage(int[] arr) {
		int sum = 0;
		int arrLength = arr.length;
		for (int i = 0; i < arrLength; i++) {
			sum += arr[i];
		}
		double avg = sum / arrLength;
		
		return avg;
	}

	public static void main(String[] args) {

		int[] marks = { 85, 95, 65, 87, 77 };
		double average = getMarksAverage(marks);
		System.out.println("Average of marks array : " + average);
	}
}
