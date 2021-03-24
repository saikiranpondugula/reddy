package threads;

public class TestSleepMethod1 extends Thread 
{
	public void run(){  
		  for(int i=1;i<=10;i++)
		  {  
		    try{Thread.sleep(500);
		    }
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    	}  
		    System.out.println(i);  
		  } 
		  for(int j=1;j<=10;j++)
		  {  
		    try{Thread.sleep(500);
		    }
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    	}  
		    System.out.println(j);  
		  } 
		 }  
		 public static void main(String args[]) throws InterruptedException
		 {  
			 TestSleepMethod1 t1=new TestSleepMethod1();  
			 TestSleepMethod1 t2=new TestSleepMethod1();  
		   
		  //t1.start();  
		  t2.join();
		  t2.start(); 
		  t1.setName("saikiran");
		  System.out.println(t1);
		 }  
}
