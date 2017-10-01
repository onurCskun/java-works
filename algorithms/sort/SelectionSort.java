package algorithms;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] list = new int[10];
		for (int i = 0; i < list.length; i++) {
		list[i] = (int) (Math.random() * 100);
		}
		selectionSort(list);
		System.out.println(Arrays.toString(list));
	}
	
	public static void selectionSort(int[] newList) {
		int i, j, temp;
		for (i = 0; i < newList.length; i++) {
			for (j = i + 1; j < newList.length; j++) {
				if(newList[j] < newList[i]) {
					temp = newList[i];
					newList[i] = newList[j];
					newList[j] = temp;
				}
			}
		}
	}
}
