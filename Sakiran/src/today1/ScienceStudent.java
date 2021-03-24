package today1;

public class ScienceStudent extends Student {

	int physicsMarks,chemistryMarks,mathsMarks;

	public ScienceStudent(int physicsMarks,int chemistryMarks, int mathsMarks) {
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
		this.physicsMarks = physicsMarks;
	}

	@Override
	public void getPercentage() {
	double  asd =  physicsMarks +  chemistryMarks + physicsMarks / 300;
	//int  ds = (int) (asd/100);
	System.out.println(asd);
	}

}
