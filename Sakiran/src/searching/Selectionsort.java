package searching;

public class Selectionsort {
	   public static void main(String[] args) {
	        int[] arr = {5,9,4,2,};
	        int temp, min; 
	        for (int i = 0; i < arr.length; i++) {
	            min = i;
	            for (int j = i + 1; j < arr.length ; j++) {
	                if(arr[j] < arr[min]) {
	                    min = j;
	                }
	            }
	            temp = arr[i];
	            arr[i] = arr[min];
	            arr[min] = temp;   
	        }
	        System.out.println("After Sorting");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	        }         
	   }
}