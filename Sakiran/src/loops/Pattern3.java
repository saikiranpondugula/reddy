package loops;

public class Pattern3 {
	public static void main(String args[])
	{
		String res = "";
		int rows,cols;
		for(rows = 1;rows<=5;rows++) {
			for(cols =5;cols>=1;cols--){
				res += cols+" ";
			}
			res +="\n";
		}
		System.out.println(res);
	}
}
