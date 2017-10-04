package algorithms;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] list = new int[10];
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(list));
		sort(list);
		System.out.println(Arrays.toString(list));
	}

	public static void sort(int[] array) {
		if (array.length == 0 || array == null)
			return;

		bubbleSort(array);
	}

	public static void bubbleSort(int[] arr) {
		int i = 0;
		int k = 0;
		int temp;
		for (i = 0; i < arr.length - 1; i++) {
			for (k = 0; k < arr.length - 1; k++) {
				if (arr[k] > arr[k+1]) {
					temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}
		}
	}
}
