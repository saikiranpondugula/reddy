import java.util.Scanner;

public class Dss
{
	public static int getLuckyNumber(String date) {
		String[] strArr = date.split("-");
		strArr[1] = "" + convertMMMtoMM(strArr[1]);
		int sum = 0;
		for (int i = 0; i < strArr.length; i++) {
			int temp = Integer.parseInt(strArr[i] + "");
			sum = sum + temp;
		}
		return getSumOfDigits(sum);
	}

	public static int convertMMMtoMM(String month) {
		month = month.toLowerCase();
		String month1 = month.substring(0, 3);
		int monthNum = 0;
		switch (month1) {
		case "jan":
			monthNum = 1;
			break;
		case "feb":
			monthNum = 2;
			break;
		case "mar":
			monthNum = 3;
			break;
		case "apr":
			monthNum = 4;
			break;
		case "may":
			monthNum = 5;
			break;
		case "jun":
			monthNum = 6;
			break;
		case "jul":
			monthNum = 7;
			break;
		case "aug":
			monthNum = 8;
			break;
		case "sep":
			monthNum = 9;
			break;
		case "oct":
			monthNum = 10;
			break;
		case "nov":
			monthNum = 11;
			break;
		case "dec":
			monthNum = 12;
			break;
		default:
			System.out.println("enter proper month...");

		}
		return monthNum;

	}

	public static int getSumOfDigits(int num) {
		int sum = 0, rem = 0;
		while (num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
			if (num == 0 && sum > 9) {
				num = sum;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your date of birth.....");
		System.out.println("your lucky number is : " + getLuckyNumber(sc.nextLine()));

	}
}
