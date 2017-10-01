package algorithms;

public class BinarySearch {

	public static void main(String args[]) {
		int list[] = { 17, 27, 65, 70, 81, 82, 88, 90, 92, 94 };
		
		search(list, 88);
		search(list, 15);
	}

	public static void search(int[] arr, int num) {
		int arrL = arr.length;
		int result = binarySearch(arr, 0, arrL - 1, num);

		if (result == -1)
			System.out.println("The list does not contain " + num);
		else
			System.out.println("The element found at index " + result);
		
	}

	public static int binarySearch(int arr[], int lowP, int highP, int num) {
		if (highP >= lowP) {
			int midP = lowP + (highP - lowP) / 2;

			if (arr[midP] == num)
				return midP;
			if (arr[midP] > num)
				return binarySearch(arr, lowP, midP - 1, num);
			else
				return binarySearch(arr, midP + 1, highP, num);
			
		}
		return -1;
		
	}
}
