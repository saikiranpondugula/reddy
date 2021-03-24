package today1;

public class HistoryStudent  extends Student{

	int historyMarks,civicsMarks;
	
	public HistoryStudent(int historyMarks,int civicsMarks) {
		this.civicsMarks = civicsMarks;
		this.historyMarks= historyMarks;
	}
	@Override
	public void getPercentage() 
	{
		double  asd =  historyMarks +  civicsMarks  / 200;
		//int  ds = (int) (asd/100);
		System.out.println(asd);
	}
}
