package nestedloops;

public class Nestedloop 
{
	public static void main(String args[])
	{                       
	String res =""; 
	for(int rows1 =1;rows1<=5 ;rows1++){
			for(int cols =1 ;cols<=rows1;cols++){
				 
		
			res += cols+" ";
		}
		res +="\n";
	}
		System.out.println(res);
}

}
