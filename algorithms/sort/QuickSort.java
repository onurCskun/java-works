package algorithms;

import java.util.*;

public class QuickSort {
	public static void main(String[] args) {
		int[] list = new int[10];
		for (int i = 0; i < list.length; i++) {
		list[i] = (int) (Math.random() * 100);
		}
		sort(list);
		System.out.println(Arrays.toString(list));
	}

	public static void sort(int[] arr) {
		if (arr.length == 0 || arr == null)
			return;

		recursive(0, arr.length - 1, arr);
	}

	// recursive things
	public static void recursive(int lIndex, int rIndex, int[] arr) {
		int index = quickSort(lIndex, rIndex, arr);

		// left side with recursively
		if (lIndex < index - 1) {
			recursive(lIndex, index - 1, arr);
		}
		// right side with recursively
		if (rIndex > index) {
			recursive(index, rIndex, arr);
		}
	}

	public static int quickSort(int pLeft, int pRight, int[] arr) {
		int pPivot = arr[pLeft];

		int temp;

		// move pointers
		while (pLeft <= pRight) {
			while (arr[pLeft] < pPivot) {
				pLeft++;
			}
			while (arr[pRight] > pPivot) {
				pRight--;
			}

			// swap
			if (pLeft <= pRight) {
				temp = arr[pLeft];
				arr[pLeft] = arr[pRight];
				arr[pRight] = temp;
				pLeft++;
				pRight--;
			}
			// for seeing step by step
			//System.out.println(Arrays.toString(arr));
		}
		return pLeft;
	}
}
