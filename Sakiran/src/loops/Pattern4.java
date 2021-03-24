package loops;

public class Pattern4 {

	public static void main(String args[])
	{
		String res = "";
		int rows,cols;
		for(rows = 1;rows<=5;rows++) {
			for(cols =1;cols<=5;cols++)
			{
				res += rows+" ";
			}
			res +="\n";
		}
		System.out.println(res);
	}
}
