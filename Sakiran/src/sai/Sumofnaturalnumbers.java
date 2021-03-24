package sai;

public class Sumofnaturalnumbers {
	static int suntotal(int number) {
		int i = 5, sum = 0;
        while(i <= number)
        {
            sum += i;
            i++;
        }
        return sum;
	}
//	static  int sumofnaturalnumber(int number) {
//		if(number<5) {
//			 return number++;
//		}
//		return number;
//	}
//	public static void main(String args[]) {
//		System.out.println(sumofnaturalnumber(1));
//	}
	
	public static void main(String args[]){
        System.out.println("Sum = " + suntotal(10 ));
	}
 
}
