package loops;

public class Pattern10 {

	public static void main(String[] args) {
		int row ,cols;
		String res ="";
		for(row =1;row <=5;row++) {
			for(cols =1;cols<=5;cols++) {
				res +=" * ";
			}
			res +="\n";
		}
		System.out.println(res);
	}
}
