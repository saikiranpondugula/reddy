package loops;

public class Pattern8 {
	public static void main(String[] args) {
		String res = "";
		int row;
		
		for ( row = 1; row <= 5; row++) {
			int count = row;
			for (int col = 1; col <= row; col++) {
				res +=count+++" ";
			}
			res +=" \r";
		}
		System.out.println(res);

	}
}

