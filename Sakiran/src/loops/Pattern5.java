package loops;

public class Pattern5 {

	public static void main(String[] args) {
		String res = "";
		int rows,cols;
		for(rows = 5;rows>=1;rows--) {
			for(cols =5;cols>=1;cols--){
				res += rows+" ";
			}
			res +="\n";
		}
		System.out.println(res);
	}
}
