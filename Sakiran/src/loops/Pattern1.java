package loops;

public class Pattern1 {

	public static void main(String[] args) {
		String res = "";
		int rows,cols;
		for(rows = 1;rows<=5;rows++) {
			for(cols =1;cols<=rows;cols++)
			{
				res += cols+" ";
			}
			res +="\n";
		}
		System.out.println(res);
	}
}

