package ass2;

import java.util.Scanner;

public class CountNumber {	
	public static void main (String[]args) {
        Scanner input = new Scanner (System.in);
        int [] number = new int [51];
        int num;
        do {
            System.out.println("Enter a value between 0 and 50 [ 0 to end ]: ");
            num = input.nextInt();
            number[num]++;
        } while (num != 0);
        
        for(int i = 0; i < number.length ; i++) {
            if (number[i] !=0) {
                if (number[i] == 1)
                    System.out.println("The value of " + i + " has " + number[i] + " occurence");
                else
                    System.out.println("The value of " + i + " has " + number[i] + " occurence"); 
            }
        }
    }		
}

