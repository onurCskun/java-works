package algorithms;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] list = { 1, 3, 0, 0, 6, 15, 11, 8, 7 };
		mergeSort(list);
		System.out.println(Arrays.toString(list));
	}

	public static int[] mergeSort(int[] arr) {
		if (arr.length <= 1) {
			return arr;
		}

		// split array in half
		int[] fHalf = new int[arr.length / 2];
		int[] sHalf = new int[arr.length - fHalf.length];
		System.arraycopy(arr, 0, fHalf, 0, fHalf.length);
		System.arraycopy(arr, fHalf.length, sHalf, 0, sHalf.length);

		mergeSort(fHalf);
		mergeSort(sHalf);

		merge(fHalf, sHalf, arr);
		return arr;
	}

	public static int[] merge(int[] firstH, int[] secondH, int[] resultArr) {

		int pf = 0; // index pointer of first half
		int ps = 0; // index pointer of second half
		int pr = 0; // index pointer of result array

		while (pf < firstH.length && ps < secondH.length) {
			if (firstH[pf] < secondH[ps]) {
				resultArr[pr] = firstH[pf];
				pf++;
			} else {
				resultArr[pr] = secondH[ps];
				ps++;
			}
			pr++;
		}

		System.arraycopy(firstH, pf, resultArr, pr, firstH.length - pf);
		System.arraycopy(secondH, ps, resultArr, pr, secondH.length - ps);
		return resultArr;
	}

}
