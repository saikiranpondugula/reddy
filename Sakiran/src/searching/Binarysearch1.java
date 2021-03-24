package searching;

import java.util.Scanner;

public class Binarysearch1 {
	static boolean  binary(int first, int last, int mid, int key,int arr[])
	{
		while(first<=last){
			if(arr[mid]<key){
				first = mid + 1;
			} 
			else {
				last = mid -1;
			}
			mid = first+last/2;
			 if( arr[mid] == key || first > last) {
				 System.out.println("Element is found at index: " + mid);  
			        break;
			}		
		   }
		return true;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,2,03,50,98,521,76,988,90};
		int first = 0,last=arr.length-1,mid = first+last,key = 03;
		System.out.println(binary( first, last, mid,  key, arr));
	}
}
