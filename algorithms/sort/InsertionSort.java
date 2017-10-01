package algorithms;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] list = new int[10];
		for (int i = 0; i < list.length; i++) {
		list[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(list));
	}
	
	

	
	public static void iSort(int[] arr) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for(int j = i; j > 0; j--) {
				if(arr[j] < arr[j-1]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j - 1] = temp;
				}
			}
		}
	}
	
	
}
