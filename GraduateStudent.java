package ass2;

public class GraduateStudent extends Student {
	private char letter;
	GraduateStudent(){
		//System.out.println("In GraduateStudent()");
	}
	
	GraduateStudent(int Id, int mid, int fin) {
		super(Id,mid,fin);
	}
	
	public char getLetterGrade() {	
		if(super.calcAvg()<=70) 
			//System.out.print("F... Fail");
			letter = 'F';
		else 
			return super.getLetterGrade();	
		return letter;
	}	
}
