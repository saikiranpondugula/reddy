package basicprogrammes2622021;

public class Biggetsof5
{
	public static void main(String args[])
	{
		String res = "";
	if(args.length!=5)
	{
		res+="invalid arguments\n";
		res+= "enter the values ";
		System.out.println(res);
		return;
	}
	int d = Integer.parseInt(args[0]);
	int s = Integer.parseInt(args[1]);
	if(d>s){
		s = d;
	} 
	d= Integer.parseInt(args[2]);
	
	if(d>s)
	{
		s =d ;
	}
	d =Integer.parseInt(args[3]);
	
	if(d>s)
	{
		s=d;
	}
	d = Integer.parseInt(args[4]);
	if(d>s)
	{
		s=d;
	}
	System.out.println(s);
	}	
}
