package basicprogrammes2622021;

import java.util.Scanner;

public class Monthdate 
{
	public static void main(String args[])
	{
		System.out.println("Enter Month Name ");
        Scanner sc = new Scanner(System.in);
        String monthName1 = sc.next();
        String monthName = monthName1.toUpperCase();
        String res = " ";
        switch(monthName)
        { 
        case "JAN"  : 
        case "MAR" :
        case "MAY" : 
        case "JUL" :
        case "AUG" :
        case "OCT" :
        case "DEC" :            
              res +=  "31 Days in "+monthName+" month";
              break;
              
        case "APL" :
        case "JUN" :
        case "SEP" :
        case "NOV" :            
              res +=  "30 Days in "+monthName+" month";
              break;
              
        case "FEB" :
            res += "28 Days in "+monthName+" month";
            break;
            
            default :
                res += "invalid month";
                }
                System.out.println(res);
	}
}
