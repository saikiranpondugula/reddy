package loops;

public class Paatern13
{
	public static void main(String args[])
	{
		String as ="";
		for(int row = 1;row<=5;row++) {
			for(int cols =1;cols<=row;cols++){
				as += "*";   
			}
		as +="\n";
		}
		System.out.println(as);
	}
}
