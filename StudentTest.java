package ass2;

public class StudentTest {
	public static void main(String[] args) {
		
		GraduateStudent Jill = new GraduateStudent();
		Jill.setId(1);
		Jill.setFinal(80);
		Jill.setMidterm(90);
		System.out.println("Jill, ID: " + Jill.getId() + ", Avg = " + Jill.calcAvg() + ", letter grade: " + Jill.getLetterGrade());
		
		GraduateStudent Rose = new GraduateStudent(2,70,65);
		System.out.println("Rose, ID: " + Rose.getId() + ", Avg = " + Rose.calcAvg() + ", letter grade: " + Rose.getLetterGrade());
		
		UnderGraduateStudent Jack = new UnderGraduateStudent(3,70,65);
		System.out.println("Jack, ID: " + Jack.getId() + ", Avg = " + Jack.calcAvg() + ", letter grade: " + Jack.getLetterGrade());
		
	}

}
