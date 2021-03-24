import java.util.Scanner;

public class Saikiranreddy 
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values in dob");
		int date  = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		int temp = date + month + year;
		System.out.println(temp);
		int tem = temp % 10;
		System.out.println(tem);
		int te = temp %100 ;
		int ff = te/10;
		System.out.println(ff);
		int qw = temp %1000;
		int rf = qw/100;
		System.out.println(rf);
		int qwr = temp /1000;
		System.out.println(qwr);
		System.out.println(tem+ff+rf+qwr);
		int ght = tem+ff+rf+qwr;
		int fdf = ght % 10; 
		int ddd = ght / 10;
		System.out.println(ddd);
		System.out.println(fdf);
		//System.out.println(sdf);
		int ddde =ddd+fdf;
		if(ddde<9)
			System.out.println("the lucky number:"+ddde);
		System.out.println(ddde);
	}
}
