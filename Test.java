package grade;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) { 
		Grades cs504 = new Grades();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of grades to input: ");
		int input = sc.nextInt();
		
		int[] student = new int[input];	
		cs504.setValues(student);	
		for(int i = 0; i < input; i++) {
			System.out.print("> Enter grade ");
			System.out.print(i+1 + " : ");
			student[i] = sc.nextInt();		
		}
		System.out.println("1) Highest: " + cs504.highest());
		System.out.println("2) Lowest: " + cs504.lowest());
		System.out.println("3) Number of grades: " + cs504.numOfGrades());
		System.out.println("4) Average: " + cs504.average());
		System.out.println("5) Number of failing grades: " + cs504.numOfFailingGrades(70));
		System.out.println("6) Histogram: ");
		cs504.histogram();
	}
}
