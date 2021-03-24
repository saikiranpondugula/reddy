package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		System.out.println("Enter the array elements:");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter a number:");
		System.out.println(getBinaryNumber(arr, sc.nextInt()));
	}

	public static String getBinaryNumber(int arr[], int num) {
		String res = "";
		Arrays.sort(arr);
		int mid = arr.length / 2;
		//System.out.println(mid);
		if (num > mid) {
			for (int i = mid; i < arr.length; i++) {
				if (num == arr[i]) {
					return res += "The value is:" + arr[i] + " Position is: " + (i+1);
				}
			}
		} else {
			for (int i = 0; i < mid; i++) {
				if (num == arr[i]) {
					return res += "The value is:" + arr[i] + " Position is: " + (i+1);
				}
			}
		}
		return null;
	}
}