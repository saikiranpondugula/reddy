package searching;

public class Studentmarks {
static	void listStudentsMarks(int studs[][]) {
	  
		for(int i = 0; i< studs.length; i++) {
			for(int j = 0;j <studs[i].length;j++) {
				System.out.print(studs[i][j] + " ");
			}
		System.out.println();
		}
	}
public static void main (String args[]){
	int studs[][]= new int [3][4];
	int k = 0;
	for(int i = 0; i< studs.length; i++) {
		for(int j = 0;j <studs[i].length;j++) {
			studs[i][j] =Integer.parseInt(args[k]);
			k++;
		}
	}
	listStudentsMarks(studs);
}
}
