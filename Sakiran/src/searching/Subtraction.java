package searching;

public class Subtraction {
	static int[][] sub(int a[][],int b [][]){
		int c[][] = new int [2][2];
		for(int i=0; i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j] = a [i][j] -   b[i][j];
			}
		}
		return c;
	}
public static void main(String ags[]) {
	int a[][] = {{5,2},{3,1}};
	int b[][] = {{12,4},{5,6}};
	int res[][] = sub(a,b);
	for(int i = 0;i<res.length;i++) {
		for(int j =0;j<res[i].length;j++) {
			System.out.print(res[i][j] + " ");
		}
	}
}
}
