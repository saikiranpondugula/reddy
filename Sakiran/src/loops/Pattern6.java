package loops;

public class Pattern6 {

	
		public static void main(String[] args) 
		  {
			String res="";
		        int count=5;
		        for (int row = 1; row <= 5; row++) 
		        {
		            for (int col = 1; col <= row; col++) 
		            {
		               res +=count+" ";    
		            }
		            count--;
		            res +="\n";
		        }
		System.out.println(res);
		  }
}
