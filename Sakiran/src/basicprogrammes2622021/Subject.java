package basicprogrammes2622021;

import java.util.Scanner;

public class Subject 
{
	public static void main(String args[])
	{
		String grade = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of marks of student in english");
		int subject1 = sc.nextInt();
		int subject2 = sc.nextInt();
		int subject3 = sc.nextInt(); 
		int subject4 = sc.nextInt();
		int subject5 = sc.nextInt();
		int total = subject1 + subject2 + subject3+ subject4 + subject5;
		int average = (total/5);
		grade ="average of Student"+average;
		
		if(average<90 && average >=70 )
		{
			grade = "the student is passed in all subjects with distinction";
		}
			else if(average <70 && average >=60)
		{
			 grade ="the student is passed in all subjects with average";
		}
			 else if(average<60 && average>=40)
			{
				grade = "the student is passed in all subjects with just average";
			}
				else if(average<=35 && average>45 )
				{
					grade = "the  student is passed" ;
				}
		else 
		{
			grade ="the student is failed in all subjects";
		}
		System.out.println(grade);
	}
}
