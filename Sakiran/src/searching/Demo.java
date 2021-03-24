package searching;

public class Demo {
public static void main(String args[]) {
	int studs[][]  = {{32,22,52,23},
			           {41,52,5,24},
			           {45,121,12,45}};
		for(int row[] : studs) {
			int sum = 0;
			for(int value : row) {
				System.out.print(value + " ");
				sum = sum + value;
			}
			System.out.println(" = " + sum);
		}
}
}
