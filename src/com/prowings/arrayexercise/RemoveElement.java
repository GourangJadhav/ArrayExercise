package com.prowings.arrayexercise;

public class RemoveElement {

	public static int[] removeNumberInNumberList(int[] numsList, int removeNum) {

		if (removeNum == 0 || removeNum < 0)
			return numsList;

		int[] newNumbersList = new int[numsList.length - 1];
		int j = 0;

		for (int i = 0; i < numsList.length; i++) {

			if (numsList[i] == removeNum) {
				continue;
			}
			newNumbersList[j++] = numsList[i];
		}
		return newNumbersList;
	}

	public static void main(String[] args) {
		int[] numbersList = { 10, 11, 12, 13, 14};
		int number = 11;
		int[] newNumsList = removeNumberInNumberList(numbersList, number);
		
		for(int num : newNumsList) {
			System.out.print(num+" ");
		}
	}
}
