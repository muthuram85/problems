package day1;

import java.util.Arrays;

public class SortZerosOnesTwos {

	public static void sort012(int[] a) {
		int low = 0, mid = 0;
		int high = a.length - 1;
		while(mid <= high) {
			switch(a[mid]) {
			case 0:
				swap(low, mid, a);
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap(mid, high,a);
				high--;
				break;
			}
		}
	}

	public static void sort01(int[] a) {
		int low = 0;
		int high = a.length - 1;
		while(low < high) {
			if(a[low] == 0) {
				low++;
			}
			if(a[high] == 1) {
				high++;
			}
			if(low < high) {
				swap(low, high,a);
				low++;
				high++;
			}
		}
	}
	
	public static void swap(int i, int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 0, 0, 1, 2, 1, 0, 1, 1, 2, 0, 1 };
		System.out.println(Arrays.toString(a));
		sort012(a);
		System.out.println(Arrays.toString(a));
		int[] b = { 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1 };
		System.out.println(Arrays.toString(b));
		sort012(b);
		System.out.println(Arrays.toString(b));
	}

}
