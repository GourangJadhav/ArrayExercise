package com.prowings.arrayexercise;

public class LargestNumberInArray {

	public static int findSecoundLargestNumberInArray(int[] arr) {

		int[] temp = new int[arr.length];
		int num = 0;
		
		for(int c = 0; c < arr.length; c++){
			temp[c] = arr[c];
		}
	
		for (int i = 0; i < temp.length; i++) {
			for (int j = i + 1; j < temp.length; j++) {
				if (temp[i] < temp[j]) {
						num = temp[i];			
						temp[i] = temp[j];	
						temp[j] = num;			
				}
			}
		}
		num = temp[1];
		return num;
	}
	public static int findThirdLargestNumberInArray(int[] arr) {

		int[] temp = new int[arr.length];
		int num = 0;
		
		for(int c = 0; c < arr.length; c++){
			temp[c] = arr[c];
		}
	
		for (int i = 0; i < temp.length; i++) {
			for (int j = i + 1; j < temp.length; j++) {
				if (temp[i] < temp[j]) {
						num = temp[i];			
						temp[i] = temp[j];	
						temp[j] = num;			
				}
			}
		}
		num = temp[2];
		return num;
	}

	public static void main(String[] args) {

		int[] numbers = { 100, 55, 85, 45, 90, 120 };
		int large2ndNumInArray = findSecoundLargestNumberInArray(numbers);
		int large3rdNumInArray = findThirdLargestNumberInArray(numbers);
		System.out.print("given array is : ");
		for(int num : numbers) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("Secound largest Number in array : "+large2ndNumInArray);
		System.out.println("Third largest Number in array : "+large3rdNumInArray);
	}
}
