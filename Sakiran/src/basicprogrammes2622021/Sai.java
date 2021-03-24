package basicprogrammes2622021;

public class Sai 
{
	public static void main(String args[])
	{
		int s = 1;
		String  res = "";
		while(s <= 5 )
		{
			//res += "welcome\n";
			res += s+ ",";
			s++;
		}
	//	System.out.println(res);
		System.out.println(res.substring(0,res.length()-1));
	}
}
