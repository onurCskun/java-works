package algorithms;

import java.util.Arrays;

public class QuickSort2 {
	public static void main(String[] args) {
		int[] list = new int[10];
		for (int i = 0; i < list.length; i++) {
		list[i] = (int) (Math.random() * 100);
		}
		sort(list);
		System.out.println(Arrays.toString(list));
	}

	public static void sort(int[] arr) {
		if (arr.length == 0 || arr == null) {
			System.out.println("There is no sortable list");
		}

		quickSort(arr, 0, arr.length - 1);
	}

	public static void quickSort(int[] arr, int pLeft, int pRight) {
		int pPivot = arr[pLeft + (pRight - pLeft) / 2];
		int pL = pLeft;
		int pR = pRight;
		int temp;

		while (pL <= pR) {
			while (arr[pL] < pPivot) {
				pL++;
			}
			while (arr[pR] > pPivot) {
				pR--;
			}

			if (pL <= pR) {
				temp = arr[pL];
				arr[pL] = arr[pR];
				arr[pR] = temp;
				pL++;
				pR--;
			}

			if (pLeft < pR) {
				quickSort(arr, pLeft, pR);
			}
			if (pL < pRight) {
				quickSort(arr, pL, pRight);
			}
		}
	}
}
