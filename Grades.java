package grade;

import java.util.Scanner;

public class Grades {
	private int[] values;

	  Grades () {
		  values = new int[3];
	  }
	  
	  Grades (int[] myArray) {
		  values = myArray;
	  }
	  
	  public void setValues(int[] myArray) { 
		  values = myArray;  
	  }
	  
	  public int[] getValues() {
		  return values;
	  }
	  
	  public int highest() {	  
		  int max = values[0];
		  for(int i=0; i<values.length; i++) {	  
			  if(values[i] > max)
				  max = values[i];
		  }
		  return max;
	  }
	  public int lowest() {
		  int min = values[0];
		  for(int i=0; i<values.length; i++) {	  
			  if(values[i] < min)
				  min = values[i];
		  }
		  return min;
	  }
	  public int numOfGrades() {
		  return values.length;
	  }
	  public double average() {
		  double sum = 0;
		  double avg = 0;
		  for(int i = 0; i<values.length; i++) {
			  sum = sum + values[i];
			  avg = sum/values.length;
		  }
		  return avg;
	  }
	  
	  public int numOfFailingGrades(int gradeValue) {
		  int count = 0;
		  for(int i = 0; i <values.length; i++) {
			  if(values[i] < gradeValue)
				  count++;
		  }
		  return count;
	  }
	  
	  public void histogram() { // prints the histogram of grades 
		  System.out.print("   90 - 100 | ");
		  for(int i = 0; i <values.length; i++) {
			  if((values[i]<=100) && (values[i] >=90)) 
				  System.out.print("*");	  
		  }
		  System.out.println();
		  System.out.print("   80 - 89  | ");
		  for(int i = 0; i <values.length; i++) {
			  if((values[i]<=89) && (values[i] >=80)) 
				  System.out.print("*");	  
		  }
		  System.out.println();
		  System.out.print("   70 - 79  | ");
		  for(int i = 0; i <values.length; i++) {
			  if((values[i]<=79) && (values[i] >=70)) 
				  System.out.print("*");  
		  }
		  System.out.println();
		  System.out.print("   60 - 69  | ");
		  for(int i = 0; i <values.length; i++) {
			  if((values[i]<=69) && (values[i] >=60)) 
				  System.out.print("*");  
		  }
		  System.out.println();
		  System.out.print("   <60      | ");
		  for(int i = 0; i <values.length; i++) {
			  if((values[i]<60)) 
				  System.out.print("*");	  
		  }
		  System.out.println();
		  
	  }



}
