package ass2;

public class UnderGraduateStudent extends Student {
	private char letter;
	UnderGraduateStudent(){
		//System.out.println("In UndergraduateStudent()");
	}
	
	UnderGraduateStudent(int Id, int mid, int fin){
		super(Id, mid, fin);
	}
	
	public char getLetterGrade() {	
		if(super.calcAvg()<70 && super.calcAvg()>=60)
			letter = 'D';
		else if (super.calcAvg()<60)
			letter = 'F';
		else
			return super.getLetterGrade();
		return letter;
	}
}
