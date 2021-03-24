package loops;

public class Pattern12 {
public static void main(String args[]) {
	 int count = 65 ;
     String res = "";
     for (int row = 1; row <= 5; row++) 
     {        
         for (int col = 1; col <= row; col++) 
         {    
             char ch = (char)count;
             res +=(ch+" ");                
             count++;
         }                
         res +="\n";
     }
     System.out.println(res);
}
}

