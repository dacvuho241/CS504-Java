package ass2;

public class Student {
	private int id;
	private int midtermExam;
	private int finalExam;
	
	Student(){
		//System.out.println("In Student()");
	}
	
	
	Student(int Id, int mid, int fin){
		id = Id;
		midtermExam = mid;
		finalExam = fin;	
	}
	
	public void setId(int Id) {
		id = Id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setMidterm(int mid) {
		midtermExam = mid;
	}
	
	public int getMidterm() {
		return midtermExam;
	}
	
	public void setFinal(int fin) {
		finalExam = fin;
	}
	
	public int getFinal() {
		return finalExam;
	}
	
	public double calcAvg() {
		double avg;
		avg = (midtermExam + finalExam) / 2.0;
	return avg;
	}
	
	public char getLetterGrade() {
		char letterGrade =' ';
		if(calcAvg() >= 90 && calcAvg() <=100)
			letterGrade = 'A';
		else if(calcAvg() >= 80)
			letterGrade = 'B';
		else if(calcAvg() >= 70)
			letterGrade = 'C';
		else 
			letterGrade = 'F';
		return letterGrade;
	}
}
